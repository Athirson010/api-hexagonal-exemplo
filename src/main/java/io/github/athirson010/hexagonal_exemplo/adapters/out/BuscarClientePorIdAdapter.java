package io.github.athirson010.hexagonal_exemplo.adapters.out;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.ClienteRepository;
import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.mapper.ClienteEntityMapper;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.BuscarClientePorIdOutputPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarClientePorIdAdapter implements BuscarClientePorIdOutputPort {
    private ClienteRepository clienteRepository;

    private ClienteEntityMapper clienteEntityMapper;

    public BuscarClientePorIdAdapter(ClienteRepository clienteRepository,
                                     ClienteEntityMapper clienteEntityMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityMapper = clienteEntityMapper;
    }

    @Override
    public Optional<Cliente> buscar(String id) {
        var clienteEntity = clienteRepository.findById(id);
        return clienteEntity.map(entity -> clienteEntityMapper.paraCliente(entity));
    }
}
