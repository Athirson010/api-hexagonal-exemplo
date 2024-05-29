package io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity;


import lombok.Data;

@Data
public class EnderecoEntity {
    private String logradouro;
    private String cidade;
    private String estado;
}
