package com.br.exercicio20;

import java.util.List;
/**
 *
 * @author tetzner
 */
public interface PedidoDAO {

    void inserir(Pedido pedido);

    Pedido buscarPorId(int id);

    List<Pedido> listarTodos();

    void atualizar(Pedido pedido);

    void deletar(int id);
}
