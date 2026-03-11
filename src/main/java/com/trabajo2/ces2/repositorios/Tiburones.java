package com.trabajo2.ces2.repositorios;

import com.trabajo2.ces2.modelos.*;
import java.util.Arrays;
import java.util.List;

public class Tiburones {

    public static final List<Tiburon> lista = Arrays.asList(

        new Tiburon("Rex","Blanco",15, Arrays.asList(
                new Comida("Atun","pez",20),
                new Comida("Foca","mamifero",80)
        )),

        new Tiburon("Blue","Azul",10, Arrays.asList(
                new Comida("Calamar","molusco",10)
        )),

        new Tiburon("Shadow","Martillo",8, Arrays.asList()),

        new Tiburon("Hunter","Tigre",12, Arrays.asList(
                new Comida("Pez espada","pez",40)
        )),

        new Tiburon("Storm","Blanco",20, Arrays.asList(
                new Comida("Delfin","mamifero",150)
        )),

        new Tiburon("Flash","Azul",7, Arrays.asList(
                new Comida("Atun","pez",15)
        )),

        new Tiburon("Blade","Martillo",14, Arrays.asList(
                new Comida("Pulpo","molusco",8)
        )),

        new Tiburon("Titan","Blanco",18, Arrays.asList(
                new Comida("Foca","mamifero",90)
        )),

        new Tiburon("Ghost","Tigre",9, Arrays.asList()),

        new Tiburon("Spike","Azul",11, Arrays.asList(
                new Comida("Calamar","molusco",12)
        )),

        new Tiburon("Wave","Blanco",6, Arrays.asList(
                new Comida("Sardina","pez",2)
        )),

        new Tiburon("Crusher","Martillo",16, Arrays.asList(
                new Comida("Atun","pez",25)
        )),

        new Tiburon("Shadow2","Tigre",13, Arrays.asList(
                new Comida("Pez globo","pez",3)
        )),

        new Tiburon("Ice","Blanco",21, Arrays.asList(
                new Comida("Foca","mamifero",85)
        )),

        new Tiburon("Thunder","Azul",19, Arrays.asList(
                new Comida("Calamar gigante","molusco",50)
        )),

        new Tiburon("Steel","Martillo",5, Arrays.asList()),

        new Tiburon("Razor","Tigre",17, Arrays.asList(
                new Comida("Pulpo","molusco",9)
        )),

        new Tiburon("Dark","Blanco",22, Arrays.asList(
                new Comida("Delfin","mamifero",130)
        )),

        new Tiburon("Speed","Azul",4, Arrays.asList(
                new Comida("Sardina","pez",1)
        )),

        new Tiburon("King","Martillo",23, Arrays.asList(
                new Comida("Atun","pez",35)
        ))

    );

}