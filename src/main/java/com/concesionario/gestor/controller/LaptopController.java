package com.concesionario.gestor.controller;

import com.concesionario.gestor.entities.Laptop;
import com.concesionario.gestor.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class LaptopController {
    // atributos
    private LaptopRepository laptopRepository;

    // constructores
    public LaptopController(LaptopRepository laptopRepository) {this.laptopRepository = laptopRepository;}
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop,@RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
    return laptopRepository.save(laptop);}
}
