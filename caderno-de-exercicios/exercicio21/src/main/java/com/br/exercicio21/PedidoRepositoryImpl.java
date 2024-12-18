package com.br.exercicio21;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tetzner
 */
public final class PedidoRepositoryImpl implements PedidoRepository {

    private final Map<Integer, Pedido> pedidos;

    public PedidoRepositoryImpl() {
        this.pedidos = new HashMap<>();
    }
    
    @Override
    public void criar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public Pedido ler(int id) {
        return pedidos.get(id);
    }

    @Override
    public void atualizar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public void deletar(int id) {
        pedidos.remove(id);
    }
      
}
