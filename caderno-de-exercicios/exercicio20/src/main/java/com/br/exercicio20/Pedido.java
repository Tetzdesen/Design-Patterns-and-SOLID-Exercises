package com.br.exercicio20;

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

    public Pedido(LocalDate dataPedido) {
        if (dataPedido == null) {
            throw new IllegalArgumentException("Dados do pedido invalidos");
        }

        this.dataPedido = dataPedido;

        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item invalido");
        }
        itens.add(item);
    }

    public double getValorPedido() {

        double valorItens = itens.stream().mapToDouble(Item::getValorTotal).sum();

        return valorItens;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

}
