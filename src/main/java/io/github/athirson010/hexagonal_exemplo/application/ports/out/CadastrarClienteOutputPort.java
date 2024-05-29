package io.github.athirson010.hexagonal_exemplo.application.ports.out;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;

public interface CadastrarClienteOutputPort {
    void cadastrar(Cliente cliente);
}
