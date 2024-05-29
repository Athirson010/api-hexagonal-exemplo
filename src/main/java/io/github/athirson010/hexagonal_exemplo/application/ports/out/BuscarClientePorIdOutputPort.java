package io.github.athirson010.hexagonal_exemplo.application.ports.out;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClientePorIdOutputPort {
    Optional<Cliente> buscar(String id);
}
