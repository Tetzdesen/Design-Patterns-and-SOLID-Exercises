package com.br.exercicio21;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        PedidoRepository pedidoRepository = new PedidoRepositoryImpl();
        PedidoService pedidoService = new PedidoService(pedidoRepository);
        Pedido pedido1 = new Pedido(1, LocalDate.now());
        pedidoService.criarPedido(pedido1);
        Pedido pedidoRecuperado = pedidoService.lerPedido(1);
        System.out.println("Pedido lido: " + pedidoRecuperado);
        pedidoRecuperado.adicionarItem(new Item(1, new Produto(1, "teste", 7.5), 5));
        pedidoService.atualizarPedido(pedidoRecuperado);
        pedidoService.deletarPedido(1);
        System.out.println("Pedido 1 deletado");
    }
}
