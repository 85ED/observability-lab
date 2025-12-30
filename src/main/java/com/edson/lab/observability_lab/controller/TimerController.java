package com.edson.lab.observabilitylab;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimerController {

    private final Timer timer;

    public TimerController(MeterRegistry registry) {
        this.timer = registry.timer("app.teste.tempo");
    }

    @GetMapping("/tempo")
    public String tempo() throws InterruptedException {
        timer.record(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        return "tempo medido";
    }
}
