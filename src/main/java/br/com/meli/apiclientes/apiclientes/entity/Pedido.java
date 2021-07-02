package br.com.meli.apiclientes.apiclientes.entity;

import java.util.List;

public class Pedido {

    private Integer id;
    private List<Produto> produtos;

    public Pedido(Integer id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
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

}
