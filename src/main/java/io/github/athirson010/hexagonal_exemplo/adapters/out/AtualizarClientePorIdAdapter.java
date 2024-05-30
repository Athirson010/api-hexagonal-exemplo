package io.github.athirson010.hexagonal_exemplo.adapters.out;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.ClienteRepository;
import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.mapper.ClienteEntityMapper;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.AtualizarClientePorIdOutputPort;
import org.springframework.stereotype.Component;

@Component
public class AtualizarClientePorIdAdapter implements AtualizarClientePorIdOutputPort {
    private ClienteRepository clienteRepository;
    private ClienteEntityMapper clienteEntityMapper;

    public AtualizarClientePorIdAdapter(ClienteRepository clienteRepository, ClienteEntityMapper clienteEntityMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityMapper = clienteEntityMapper;
    }

    @Override
    public void atualizar(Cliente cliente) {
        var clienteEntity = clienteEntityMapper.paraClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }
}
