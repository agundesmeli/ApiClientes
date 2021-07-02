package br.com.meli.apiclientes.apiclientes.service;

import br.com.meli.apiclientes.apiclientes.dto.PedidoDTO;
import br.com.meli.apiclientes.apiclientes.entity.Pedido;
import br.com.meli.apiclientes.apiclientes.entity.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoService {


    public static Double calcularValorTotal(Pedido pedido) {
        Double valorTotal = 0.0;
        for (Produto p : pedido.getProdutos()) {
            valorTotal+=p.getPreco()*p.getQuantidade();
        }
        return valorTotal;
    }

    public static List<PedidoDTO> convertePedidos(List<Pedido> pedidos) {
        return pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
    }
}
