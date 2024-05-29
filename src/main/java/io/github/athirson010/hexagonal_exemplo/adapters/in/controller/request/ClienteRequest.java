package io.github.athirson010.hexagonal_exemplo.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequest {
    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

    @NotBlank
    private String cep;
}
