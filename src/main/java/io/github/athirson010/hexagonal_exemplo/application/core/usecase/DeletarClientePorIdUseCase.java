package io.github.athirson010.hexagonal_exemplo.application.core.usecase;

import io.github.athirson010.hexagonal_exemplo.application.ports.in.BuscarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.DeletarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.DeletarClientePorIdOutputPort;

public class DeletarClientePorIdUseCase implements DeletarClientePorIdInputPort {
    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final DeletarClientePorIdOutputPort deletarClientePorIdOutputPort;

    public DeletarClientePorIdUseCase(BuscarClientePorIdInputPort buscarClientePorIdInputPort,
                                      DeletarClientePorIdOutputPort deletarClientePorIdOutputPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.deletarClientePorIdOutputPort = deletarClientePorIdOutputPort;
    }

    @Override
    public void deletar(String id) {
        buscarClientePorIdInputPort.buscar(id);
        deletarClientePorIdOutputPort.deletar(id);
    }
}
