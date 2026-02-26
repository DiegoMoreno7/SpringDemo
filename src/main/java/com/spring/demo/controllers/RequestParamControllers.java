package com.spring.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamControllers {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false,
                                defaultValue = "hola a todos") String informacion) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInfo(informacion);
        return parametro1;
    }
}
