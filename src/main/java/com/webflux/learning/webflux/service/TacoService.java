package com.webflux.learning.webflux.service;

import com.webflux.learning.webflux.entity.Taco;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface TacoService {
    Flux<Taco> getTacos();

    Mono<Taco> findTacoById(Long id);

    Mono<Taco> createTaco(Mono<Taco> tacoMono);
}
