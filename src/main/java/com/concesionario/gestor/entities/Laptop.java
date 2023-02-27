package com.concesionario.gestor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "laptops")

public class Laptop {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer memoriaRam;
    private Boolean placaDedicada;
    private LocalDate fechaLanzamiento;
    private Double precio;

   // constructores

    public Laptop() {
    }

    public Laptop(Long id, String marca, String modelo, Integer memoriaRam, Boolean placaDedicada, LocalDate fechaLanzamiento, Double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.placaDedicada = placaDedicada;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
    }
    // getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Boolean getPlacaDedicada() {
        return placaDedicada;
    }

    public void setPlacaDedicada(Boolean placaDedicada) {
        this.placaDedicada = placaDedicada;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    // toString

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", placaDedicada=" + placaDedicada +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", precio=" + precio +
                '}';
    }
}

