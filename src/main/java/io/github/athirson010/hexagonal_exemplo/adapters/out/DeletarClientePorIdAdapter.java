package io.github.athirson010.hexagonal_exemplo.adapters.out;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.ClienteRepository;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.DeletarClientePorIdOutputPort;
import org.springframework.stereotype.Component;

@Component
public class DeletarClientePorIdAdapter implements DeletarClientePorIdOutputPort {
    private ClienteRepository clienteRepository;

    @Override
    public void deletar(String id) {
        clienteRepository.deleteById(id);
    }
}
