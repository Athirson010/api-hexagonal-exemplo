package io.github.athirson010.hexagonal_exemplo.application.ports.out;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;

public interface BuscarEnderecoPorCepOutputPort {
    Endereco buscar(String cep);
}
