package com.trabajo2.ces2.controladores;

import com.trabajo2.ces2.modelos.Comida;
import com.trabajo2.ces2.modelos.Tiburon;
import com.trabajo2.ces2.repositorios.Tiburones;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PeticionesTiburones {

    // PETICION 1
    @GetMapping("/peticion1")
    public String peticion1(Model model){

        List<String> nombres = Tiburones.lista.stream()
                .map(Tiburon::getNombre)
                .collect(Collectors.toList());

        model.addAttribute("resultado", nombres);

        return "peticion1";
    }

    // PETICION 2
    @GetMapping("/peticion2")
    public String peticion2(Model model){

        IntSummaryStatistics stats = Tiburones.lista.stream()
                .collect(Collectors.summarizingInt(Tiburon::getEdad));

        model.addAttribute("conteo", stats.getCount());
        model.addAttribute("suma", stats.getSum());
        model.addAttribute("promedio", stats.getAverage());
        model.addAttribute("min", stats.getMin());
        model.addAttribute("max", stats.getMax());

        return "peticion2";
    }

    // PETICION 3
    @GetMapping("/peticion3")
    public String peticion3(Model model){

        List<String> comidas = Tiburones.lista.stream()
                .flatMap(t -> t.getComidas().stream())
                .map(Comida::getNombre)
                .collect(Collectors.toList());

        model.addAttribute("resultado", comidas);

        return "peticion3";
    }

    // PETICION 4
    @GetMapping("/peticion4")
    public String peticion4(Model model){

        boolean sinComida = Tiburones.lista.stream()
                .anyMatch(t -> t.getComidas().isEmpty());

        boolean masDeUna = Tiburones.lista.stream()
                .anyMatch(t -> t.getComidas().size() > 1);

        boolean masDeTres = Tiburones.lista.stream()
                .noneMatch(t -> t.getComidas().size() > 3);

        model.addAttribute("sinComida", sinComida);
        model.addAttribute("masDeUna", masDeUna);
        model.addAttribute("masDeTres", masDeTres);

        return "peticion4";
    }

    // PETICION 5
    @GetMapping("/peticion5")
    public String peticion5(Model model){

        Comida mayor = Tiburones.lista.stream()
                .flatMap(t -> t.getComidas().stream())
                .max((c1, c2) -> Double.compare(c1.getPeso(), c2.getPeso()))
                .orElse(null);

        model.addAttribute("resultado", mayor);

        return "peticion5";
    }

}