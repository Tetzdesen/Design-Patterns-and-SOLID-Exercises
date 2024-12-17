package com.br.exercicio20;

/**
 *
 * @author tetzner
 */

class Produto {
    private int id;
    private final String nomeProduto;
    private final int quantidade;
    private final double valor;

    public Produto(String nomeProduto, int quantidade, double valor) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    
}
