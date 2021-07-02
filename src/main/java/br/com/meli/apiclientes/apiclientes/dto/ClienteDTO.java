package br.com.meli.apiclientes.apiclientes.dto;

import java.util.List;

public class ClienteDTO {

    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<PedidoDTO> pedidosDTO;

    public ClienteDTO(Integer id, String nome, String cpf, String email, String telefone, List<PedidoDTO> pedidosDTO) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pedidosDTO = pedidosDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<PedidoDTO> getPedidosDTO() {
        return pedidosDTO;
    }

    public void setPedidosDTO(List<PedidoDTO> pedidosDTO) {
        this.pedidosDTO = pedidosDTO;
    }
}
