package com.br.exercicio21;

/**
 *
 * @author tetzner
 */
public final class Produto {

    private final int id;
    private final String nomeProduto;
    private final double valor;

    public Produto(int id, String nomeProduto, double valor) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nomeProduto=" + nomeProduto + ", valor=" + valor + '}';
    }
    
}
