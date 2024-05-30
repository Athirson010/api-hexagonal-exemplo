package io.github.athirson010.hexagonal_exemplo.adapters.in.controller.mapper;

import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.request.ClienteRequest;
import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response.ClienteResponse;
import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response.EnderecoResponse;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-30T20:12:11-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente paraCliente(ClienteRequest request) {
        if ( request == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setNome( request.getNome() );
        cliente.setCpf( request.getCpf() );

        return cliente;
    }

    @Override
    public ClienteResponse paraClienteResponse(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponse clienteResponse = new ClienteResponse();

        clienteResponse.setNome( cliente.getNome() );
        clienteResponse.setEndereco( enderecoToEnderecoResponse( cliente.getEndereco() ) );
        clienteResponse.setCpf( cliente.getCpf() );
        clienteResponse.setCpfValido( cliente.getCpfValido() );

        return clienteResponse;
    }

    protected EnderecoResponse enderecoToEnderecoResponse(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoResponse enderecoResponse = new EnderecoResponse();

        enderecoResponse.setLogradouro( endereco.getLogradouro() );
        enderecoResponse.setCidade( endereco.getCidade() );
        enderecoResponse.setEstado( endereco.getEstado() );

        return enderecoResponse;
    }
}
