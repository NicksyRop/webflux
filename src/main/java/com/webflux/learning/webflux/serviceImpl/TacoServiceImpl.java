package com.webflux.learning.webflux.serviceImpl;

import com.webflux.learning.webflux.entity.Taco;
import com.webflux.learning.webflux.repository.TacoRepository;
import com.webflux.learning.webflux.service.TacoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TacoServiceImpl implements TacoService {
    private final TacoRepository tacoRepository;

    public TacoServiceImpl(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    @Override
    public Flux<Taco> getTacos() {
        return tacoRepository.findAll().take(12);
    }

    @Override
    public Mono<Taco> findTacoById(Long id) {
        return tacoRepository.findById(id);
    }

    @Override
    public Mono<Taco> createTaco(Mono<Taco> tacoMono) {
        return tacoRepository.saveAll(tacoMono).next();
    }
}
