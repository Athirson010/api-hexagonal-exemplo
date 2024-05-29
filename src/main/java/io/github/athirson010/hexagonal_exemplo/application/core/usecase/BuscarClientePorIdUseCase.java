package io.github.athirson010.hexagonal_exemplo.application.core.usecase;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.BuscarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.BuscarClientePorIdOutputPort;


public class BuscarClientePorIdUseCase implements BuscarClientePorIdInputPort {
    private final BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    public BuscarClientePorIdUseCase(BuscarClientePorIdOutputPort buscarClientePorIdOutputPort) {
        this.buscarClientePorIdOutputPort = buscarClientePorIdOutputPort;
    }

    @Override
    public Cliente buscar(String id) {
        return buscarClientePorIdOutputPort.buscar(id)
                .orElseThrow(() -> new RuntimeException("Cliente nao encontrado"));
    }
}
