package br.com.meli.apiclientes.apiclientes.dto;

import br.com.meli.apiclientes.apiclientes.entity.Pedido;
import br.com.meli.apiclientes.apiclientes.entity.Produto;
import br.com.meli.apiclientes.apiclientes.service.PedidoService;

import java.util.List;

public class PedidoDTO {

    private Integer id;
    private List<Produto> produtos;
    private Double valorTotal;


    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.produtos = pedido.getProdutos();
        this.valorTotal = PedidoService.calcularValorTotal(pedido);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
