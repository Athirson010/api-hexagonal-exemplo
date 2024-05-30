package io.github.athirson010.hexagonal_exemplo.config;


import io.github.athirson010.hexagonal_exemplo.adapters.out.DeletarClientePorIdAdapter;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.BuscarClientePorIdUseCase;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.DeletarClientePorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeletarClientePorIdConfig {
    @Bean
    public DeletarClientePorIdUseCase deleteClientePorIdConfig(
            BuscarClientePorIdUseCase buscarClientePorIdUseCase,
            DeletarClientePorIdAdapter deletarClientePorIdAdapter
    ) {
        return new DeletarClientePorIdUseCase(buscarClientePorIdUseCase, deletarClientePorIdAdapter);
    }
}
