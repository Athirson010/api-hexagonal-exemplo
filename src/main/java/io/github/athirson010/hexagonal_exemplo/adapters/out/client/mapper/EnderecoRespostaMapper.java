package io.github.athirson010.hexagonal_exemplo.adapters.out.client.mapper;

import io.github.athirson010.hexagonal_exemplo.adapters.out.client.response.EnderecoResponse;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoRespostaMapper {
    Endereco paraEndereco(EnderecoResponse enderecoResponse);
}
