package com.br.exercicio20;

import java.util.List;

/**
 *
 * @author tetzner
 */
public interface ItemDAO {
    void inserir(Item item);
    Item buscarPorId(int id);
    List<Item> listarTodos();
    void atualizar(Item item);
    void deletarPorId(int id);
}
