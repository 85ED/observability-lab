package com.edson.lab.observabilitylab;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    private final Counter testeCounter;

    public MetricsController(MeterRegistry registry) {
        this.testeCounter = registry.counter("teste.endpoint.chamadas");
    }

    @GetMapping("/metrica")
    public String metrica() {
        testeCounter.increment();
        return "contador incrementado";
    }

    @GetMapping("/erro")
    public String erro() {
        throw new RuntimeException("erro proposital para observabilidade");
    }

}
