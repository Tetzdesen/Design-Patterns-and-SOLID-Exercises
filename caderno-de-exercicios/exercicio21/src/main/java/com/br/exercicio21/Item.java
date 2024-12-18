package com.br.exercicio21;

/**
 *
 * @author tetzner
 */
public final class Item {

    private final int id;
    private final Produto produto;
    private final int quantidade;

    public Item(int id, Produto produto, int quantidade) {

        if (id < 1 || quantidade < 0 || produto == null) {
            throw new IllegalArgumentException("Dados do item invalidos");
        }
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public int getId() {
        return id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + '}';
    }

}
