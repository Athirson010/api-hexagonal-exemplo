package io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response;

import lombok.Data;

@Data
public class EnderecoResponse {
    private String logradouro;
    private String cidade;
    private String estado;
}
