package io.github.athirson010.hexagonal_exemplo.adapters.out.repository;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
