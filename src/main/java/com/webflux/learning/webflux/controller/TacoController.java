package com.webflux.learning.webflux.controller;

import com.webflux.learning.webflux.entity.Taco;
import com.webflux.learning.webflux.service.TacoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.event.MouseMotionAdapter;

@RestController
@RequestMapping("/api/vi/taco")
public class TacoController {
    private  final TacoService tacoService;

    public TacoController(TacoService tacoService) {
        this.tacoService = tacoService;
    }


    @GetMapping
    public Flux<Taco> getRecentTacos(){
        return tacoService.getTacos();
    }

    @GetMapping("/{id}")
    public Mono<Taco> findTacoById(@PathVariable("id") final Long id){
        return tacoService.findTacoById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Taco> createTaco(@RequestBody Mono<Taco> tacoMono){
        return tacoService.createTaco(tacoMono);
    }
}
