package io.github.athirson010.hexagonal_exemplo.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clientes")
public class ClienteEntity {
    @Id
    private String id;
    private String nome;
    private EnderecoEntity endereco;
    private String cpf;
    private Boolean cpfValido;
}
