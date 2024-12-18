package com.br.exercicio21;

/**
 *
 * @author tetzner
 */
public interface PedidoRepository {
    void criar(Pedido pedido);
    Pedido ler(int id);
    void atualizar(Pedido pedido);
    void deletar(int id);
}
