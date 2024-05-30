package io.github.athirson010.hexagonal_exemplo.config;

import io.github.athirson010.hexagonal_exemplo.adapters.out.AtualizarClientePorIdAdapter;
import io.github.athirson010.hexagonal_exemplo.adapters.out.BuscarEnderecoPorCepAdapter;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.AtualizarClientePorIdUseCase;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.BuscarClientePorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarClientePorIdConfig {
    @Bean
    public AtualizarClientePorIdUseCase atualizarClientePorIdUseCase(
            BuscarClientePorIdUseCase buscarClientePorIdUseCase,
            BuscarEnderecoPorCepAdapter buscarEnderecoPorCepAdapter,
            AtualizarClientePorIdAdapter atualizarClientePorIdAdapter
    ) {
        return new AtualizarClientePorIdUseCase(buscarClientePorIdUseCase, buscarEnderecoPorCepAdapter, atualizarClientePorIdAdapter);
    }
}
