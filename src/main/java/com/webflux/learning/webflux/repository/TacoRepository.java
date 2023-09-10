package com.webflux.learning.webflux.repository;

import com.webflux.learning.webflux.entity.Taco;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TacoRepository extends ReactiveCrudRepository<Taco,Long> {
}
