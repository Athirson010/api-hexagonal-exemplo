package io.github.athirson010.hexagonal_exemplo.adapters.out;

import io.github.athirson010.hexagonal_exemplo.adapters.out.client.BuscarEnderecoPorCepClient;
import io.github.athirson010.hexagonal_exemplo.adapters.out.client.mapper.EnderecoRespostaMapper;
import io.github.athirson010.hexagonal_exemplo.application.core.domain.Endereco;
import io.github.athirson010.hexagonal_exemplo.application.ports.out.BuscarEnderecoPorCepOutputPort;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepAdapter implements BuscarEnderecoPorCepOutputPort {
    private final BuscarEnderecoPorCepClient buscarEnderecoPorCepClient;
    private final EnderecoRespostaMapper enderecoRespostaMapper;

    public BuscarEnderecoPorCepAdapter(BuscarEnderecoPorCepClient buscarEnderecoPorCepClient, EnderecoRespostaMapper enderecoRespostaMapper) {
        this.buscarEnderecoPorCepClient = buscarEnderecoPorCepClient;
        this.enderecoRespostaMapper = enderecoRespostaMapper;
    }

    @Override
    public Endereco buscar(String cep) {
        var enderecoResposta = buscarEnderecoPorCepClient.buscar(cep);
        return enderecoRespostaMapper.paraEndereco(enderecoResposta);
    }
}
