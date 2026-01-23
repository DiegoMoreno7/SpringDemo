package com.spring.demo.controllers;

import com.spring.demo.models.Empleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    public Map<String,Object> detallesInfo2() {
        Empleados empleado1 = new Empleados("Juan Diego", "Moreno","Calle 1",
        23, 311512945, 1);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);
        return respuesta;
    }

}
