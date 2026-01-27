package com.spring.demo.controllers;

import com.spring.demo.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class EjemploController {


    @GetMapping("/detalles_info")
    public String info(Model model){
        Empleados empleado1 = new Empleados("Juan Diego", "Moreno",null,
                23, 311512945, 1);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
                new Empleados("Miriam", "Lupercio", "Lagos", 25, 3123213, 23)
        );
    }

}
