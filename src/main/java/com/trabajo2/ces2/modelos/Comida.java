package com.trabajo2.ces2.modelos;

public class Comida {

    private String nombre;
    private String tipo;
    private double peso;

    public Comida(String nombre, String tipo, double peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
}