package io.github.athirson010.hexagonal_exemplo.application.core.usecase;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.AtualizarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.BuscarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.AtualizarClientePorIdOutputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.BuscarEnderecoPorCepOutputPort;

public class AtualizarClientePorIdUseCase implements AtualizarClientePorIdInputPort {
    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort;
    private final AtualizarClientePorIdOutputPort atualizarClientePorIdOutputPort;

    public AtualizarClientePorIdUseCase(BuscarClientePorIdInputPort buscarClientePorIdInputPort, BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort, AtualizarClientePorIdOutputPort atualizarClientePorIdOutputPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.buscarEnderecoPorCepOutputPort = buscarEnderecoPorCepOutputPort;
        this.atualizarClientePorIdOutputPort = atualizarClientePorIdOutputPort;
    }

    @Override
    public void atualizar(Cliente cliente, String cep) {
        buscarClientePorIdInputPort.buscar(cliente.getId());
        var endereco = buscarEnderecoPorCepOutputPort.buscar(cep);
        cliente.setEndereco(endereco);
        atualizarClientePorIdOutputPort.atualizar(cliente);
    }
}
