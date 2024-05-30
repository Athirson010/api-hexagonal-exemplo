package io.github.athirson010.hexagonal_exemplo.config;


import io.github.athirson010.hexagonal_exemplo.adapters.out.BuscarEnderecoPorCepAdapter;
import io.github.athirson010.hexagonal_exemplo.adapters.out.CadastrarClienteAdapter;
import io.github.athirson010.hexagonal_exemplo.application.core.usecase.CadastrarClienteUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadastrarClienteConfig {

    @Bean
    public CadastrarClienteUsecase cadastrarClienteUsecase(
            BuscarEnderecoPorCepAdapter buscarEnderecoPorCepAdapter,
            CadastrarClienteAdapter cadastrarClienteAdapter
    ) {
        return new CadastrarClienteUsecase(buscarEnderecoPorCepAdapter, cadastrarClienteAdapter);
    }

}
