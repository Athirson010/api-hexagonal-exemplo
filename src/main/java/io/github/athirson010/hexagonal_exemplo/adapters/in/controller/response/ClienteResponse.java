package io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response;

import lombok.Data;

@Data
public class ClienteResponse {
    private String nome;
    private EnderecoResponse endereco;
    private String cpf;
    private Boolean cpfValido;
}
