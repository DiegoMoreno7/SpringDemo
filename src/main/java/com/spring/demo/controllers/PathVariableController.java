package com.spring.demo.controllers;


import com.spring.demo.models.Empleados;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInfo(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleados creaEmple(@RequestBody Empleados empleado1) {
        return empleado1;
    }
}
