package com.br.exercicio21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tetzner
 */
public final class Pedido {

    private int id;
    private LocalDate dataPedido;
    private final List<Item> itens;

    public Pedido(int id, LocalDate dataPedido) {
        if (id < 1 || dataPedido == null) {
            throw new IllegalArgumentException("Dados do pedido invalidos");
        }

        this.id = id;
        this.dataPedido = dataPedido;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item invalido");
        }
        itens.add(item);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", dataPedido=" + dataPedido + ", itens=" + itens + '}';
    }

}
