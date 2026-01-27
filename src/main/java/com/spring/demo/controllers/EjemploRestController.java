package com.spring.demo.controllers;

import com.spring.demo.models.Empleados;
import com.spring.demo.models.dto.ClaseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    public ClaseDTO detallesInfo2() {
//        Empleados empleado1 = new Empleados("Juan Diego", "Moreno","Calle 1",
//        23, 311512945, 1);
//        Map<String, Object> respuesta = new HashMap<>();
//        respuesta.put("Empleado", empleado1);
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("admin");
        return usuario1;
    }

}
