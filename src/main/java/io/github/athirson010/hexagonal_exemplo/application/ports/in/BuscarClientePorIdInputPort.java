package io.github.athirson010.hexagonal_exemplo.application.ports.in;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;

public interface BuscarClientePorIdInputPort {
    Cliente buscar(String id);
}
