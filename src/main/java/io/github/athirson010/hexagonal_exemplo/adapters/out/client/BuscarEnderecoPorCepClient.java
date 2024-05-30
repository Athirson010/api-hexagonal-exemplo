package io.github.athirson010.hexagonal_exemplo.adapters.out.client;

import io.github.athirson010.hexagonal_exemplo.adapters.out.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "BuscarEnderecoPorCepClient",
        url = "${viacep.url}"
)
public interface BuscarEnderecoPorCepClient {
    @GetMapping("/ws/{cep}/json")
    EnderecoResponse buscar(@PathVariable("cep") String cep);
}
