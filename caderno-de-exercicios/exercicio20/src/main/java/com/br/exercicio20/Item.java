package com.br.exercicio20;

/**
 *
 * @author tetzner
 */
public final class Item {

    private int id;
    private final String nome;
    private final int quantidade;
    private final double valorUnitario;
    private final String tipo;
    private final Produto produto;

    public Item(String nome, int quantidade, double valorUnitario, String tipo, Produto produto) {
        if (nome == null || quantidade < 0 || valorUnitario < 0.0 || tipo == null || produto == null) {
            throw new IllegalArgumentException("Dados do item invalidos");
        }
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.tipo = tipo;
        this.produto = produto;
    }

    public double getValorTotal() {
        return quantidade * valorUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Item{" + "nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", tipo=" + tipo + '}';
    }
}
