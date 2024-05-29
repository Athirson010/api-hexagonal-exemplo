package io.github.athirson010.hexagonal_exemplo.adapters.out.repository.mapper;


import io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity.ClienteEntity;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {
    ClienteEntity paraClienteEntity(Cliente cliente);

    Cliente paraCliente(ClienteEntity clienteEntity);
}
