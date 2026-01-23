package com.spring.demo.controllers;

import com.spring.demo.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {


    @GetMapping("/detalles_info")
    public String info(Model model){
        Empleados empleado1 = new Empleados("Juan Diego", "Moreno","Calle 1",
                23, 311512945, 1);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

}
