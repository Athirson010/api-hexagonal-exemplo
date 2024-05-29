package io.github.athirson010.hexagonal_exemplo.adapters.in.controller.mapper;

import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.request.ClienteRequest;
import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response.ClienteResponse;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "cpfValido", ignore = true)
    Cliente paraCliente(ClienteRequest request);

    ClienteResponse paraClienteResponse(Cliente cliente);
}
