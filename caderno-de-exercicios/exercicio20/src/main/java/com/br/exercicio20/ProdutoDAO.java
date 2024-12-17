package com.br.exercicio20;

import java.util.List;

/**
 *
 * @author tetzner
 */
public interface ProdutoDAO {
    void inserir(Produto produto);

    Produto buscarPorId(int id);

    List<Produto> listarTodos();

    void atualizar(Produto produto);

    void deletar(int id);
}
