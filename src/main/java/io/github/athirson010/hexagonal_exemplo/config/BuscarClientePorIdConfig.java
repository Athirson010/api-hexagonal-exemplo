package io.github.athirson010.hexagonal_exemplo.config;

import io.github.athirson010.hexagonal_exemplo.adapters.out.BuscarClientePorIdAdapter;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.BuscarClientePorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarClientePorIdConfig {
    @Bean
    public BuscarClientePorIdUseCase buscarClientePorIdUseCase(
            BuscarClientePorIdAdapter buscarClientePorIdAdapter
    ) {
        return new BuscarClientePorIdUseCase(buscarClientePorIdAdapter);
    }
}
