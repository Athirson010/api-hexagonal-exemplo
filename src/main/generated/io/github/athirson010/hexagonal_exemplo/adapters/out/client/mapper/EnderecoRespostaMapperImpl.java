package io.github.athirson010.hexagonal_exemplo.adapters.out.client.mapper;

import io.github.athirson010.hexagonal_exemplo.adapters.out.client.response.EnderecoResponse;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-30T20:12:10-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class EnderecoRespostaMapperImpl implements EnderecoRespostaMapper {

    @Override
    public Endereco paraEndereco(EnderecoResponse enderecoResponse) {
        if ( enderecoResponse == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setLogradouro( enderecoResponse.getLogradouro() );
        endereco.setCidade( enderecoResponse.getCidade() );
        endereco.setEstado( enderecoResponse.getEstado() );

        return endereco;
    }
}
