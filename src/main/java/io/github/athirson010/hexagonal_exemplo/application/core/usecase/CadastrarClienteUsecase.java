package io.github.athirson010.hexagonal_exemplo.application.core.usecase;

import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.CadastrarClienteInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.BuscarEnderecoPorCepOutputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.CadastrarClienteOutputPort;

public class CadastrarClienteUsecase implements CadastrarClienteInputPort {
    private final BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort;
    private final CadastrarClienteOutputPort cadastrarClienteOutputPort;

    public CadastrarClienteUsecase(BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort,
                                   CadastrarClienteOutputPort cadastrarClienteOutputPort) {
        this.buscarEnderecoPorCepOutputPort = buscarEnderecoPorCepOutputPort;
        this.cadastrarClienteOutputPort = cadastrarClienteOutputPort;
    }

    @Override
    public void cadastrar(Cliente cliente, String cep) {
        var endereco = buscarEnderecoPorCepOutputPort.buscar(cep);
        cliente.setEndereco(endereco);
        cadastrarClienteOutputPort.cadastrar(cliente);
    }
}
