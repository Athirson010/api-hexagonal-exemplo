package io.github.athirson010.hexagonal_exemplo.adapters.out;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.ClienteRepository;
import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.mapper.ClienteEntityMapper;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.CadastrarClienteOutputPort;
import org.springframework.stereotype.Component;

@Component
public class CadastrarClienteAdapter implements CadastrarClienteOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;

    public CadastrarClienteAdapter(ClienteRepository clienteRepository,
                                   ClienteEntityMapper clienteEntityMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityMapper = clienteEntityMapper;
    }

    @Override
    public void cadastrar(Cliente cliente) {
        var clienteEntity = clienteEntityMapper.paraClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }
}
