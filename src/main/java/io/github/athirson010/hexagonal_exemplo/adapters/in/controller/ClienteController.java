package io.github.athirson010.hexagonal_exemplo.adapters.in.controller;

import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.mapper.ClienteMapper;
import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.request.ClienteRequest;
import io.github.athirson010.hexagonal_exemplo.adapters.in.controller.response.ClienteResponse;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.BuscarClientePorIdInputPort;
import io.github.athirson010.hexagonal_exemplo.application.ports.in.CadastrarClienteInputPort;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    private CadastrarClienteInputPort cadastrarClienteInputPort;
    private BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private ClienteMapper clienteMapper;

    public ClienteController(CadastrarClienteInputPort cadastrarClienteInputPort,
                             BuscarClientePorIdInputPort buscarClientePorIdInputPort,
                             ClienteMapper clienteMapper) {
        this.cadastrarClienteInputPort = cadastrarClienteInputPort;
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.clienteMapper = clienteMapper;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@Valid @RequestBody ClienteRequest request) {
        var cliente = clienteMapper.paraCliente(request);
        cadastrarClienteInputPort.cadastrar(cliente, request.getCep());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarPorId(@PathVariable String id) {
        var cliente = buscarClientePorIdInputPort.buscar(id);
        var clienteResponse = clienteMapper.paraClienteResponse(cliente);
        return ResponseEntity.ok().body(clienteResponse);
    }
}
