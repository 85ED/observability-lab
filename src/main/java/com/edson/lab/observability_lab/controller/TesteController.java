package com.edson.lab.observabilitylab;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    private final Counter contador;

    public TesteController(MeterRegistry registry) {
        this.contador = registry.counter("app.teste.chamadas");
    }

    @GetMapping("/teste")
    public String teste() {
        contador.increment();
        return "teste ok";
    }
}
