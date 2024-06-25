package org.example;

public class Cliente {

    private String nome;
    private String sobrenome;
    private Conta conta;
    private String cliente;
    public Cliente (String nome, String sobrenome, Cliente cliente){
        this.nome = "Sofia";
        this.sobrenome = "Cabral";
        this.cliente = nome.concat(sobrenome);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    public Conta getConta (){
        return conta;
    }
    public void setConta(Conta conta){
        this.conta = conta;
    }
}
