package com.trabajo2.ces2.modelos;

import java.util.List;

public class Tiburon {

    private String nombre;
    private String especie;
    private int edad;
    private List<Comida> comidas;

    public Tiburon(String nombre, String especie, int edad, List<Comida> comidas) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.comidas = comidas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public List<Comida> getComidas() {
        return comidas;
    }
}   