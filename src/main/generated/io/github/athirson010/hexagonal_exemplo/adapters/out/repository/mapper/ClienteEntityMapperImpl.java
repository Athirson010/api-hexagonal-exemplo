package io.github.athirson010.hexagonal_exemplo.adapters.out.repository.mapper;

import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity.ClienteEntity;
import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity.EnderecoEntity;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-30T20:03:36-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ClienteEntityMapperImpl implements ClienteEntityMapper {

    @Override
    public ClienteEntity paraClienteEntity(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteEntity clienteEntity = new ClienteEntity();

        clienteEntity.setId( cliente.getId() );
        clienteEntity.setNome( cliente.getNome() );
        clienteEntity.setEndereco( enderecoToEnderecoEntity( cliente.getEndereco() ) );
        clienteEntity.setCpf( cliente.getCpf() );
        clienteEntity.setCpfValido( cliente.getCpfValido() );

        return clienteEntity;
    }

    @Override
    public Cliente paraCliente(ClienteEntity clienteEntity) {
        if ( clienteEntity == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteEntity.getId() );
        cliente.setNome( clienteEntity.getNome() );
        cliente.setEndereco( enderecoEntityToEndereco( clienteEntity.getEndereco() ) );
        cliente.setCpf( clienteEntity.getCpf() );
        cliente.setCpfValido( clienteEntity.getCpfValido() );

        return cliente;
    }

    protected EnderecoEntity enderecoToEnderecoEntity(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoEntity enderecoEntity = new EnderecoEntity();

        enderecoEntity.setLogradouro( endereco.getLogradouro() );
        enderecoEntity.setCidade( endereco.getCidade() );
        enderecoEntity.setEstado( endereco.getEstado() );

        return enderecoEntity;
    }

    protected Endereco enderecoEntityToEndereco(EnderecoEntity enderecoEntity) {
        if ( enderecoEntity == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setLogradouro( enderecoEntity.getLogradouro() );
        endereco.setCidade( enderecoEntity.getCidade() );
        endereco.setEstado( enderecoEntity.getEstado() );

        return endereco;
    }
}
