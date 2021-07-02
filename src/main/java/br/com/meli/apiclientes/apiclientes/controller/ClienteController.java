package br.com.meli.apiclientes.apiclientes.controller;

import br.com.meli.apiclientes.apiclientes.dto.ClienteDTO;
import br.com.meli.apiclientes.apiclientes.entity.Cliente;
import br.com.meli.apiclientes.apiclientes.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping
    @RequestMapping
    public ResponseEntity<?> obterPedidos(@RequestBody Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getEmail(),
                cliente.getTelefone(), PedidoService.convertePedidos(cliente.getPedidos()));
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(clienteDTO);
    }
}
