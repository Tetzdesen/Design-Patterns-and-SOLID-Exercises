package com.br.exercicio20;

import java.util.List;

/**
 *
 * @author tetzner
 */
public class ItemDAOMySQL implements ItemDAO {

    @Override
    public void inserir(Item item) {
        System.out.println("Inserindo dados no mysql na tabela de item");
    }

    @Override
    public Item buscarPorId(int id) {
        System.out.println("Item por id encontrado");
        return null;
    }

    @Override
    public List<Item> listarTodos() {
        System.out.println("Item listado e retornados ");
        return null;
    }

    @Override
    public void atualizar(Item item) {
        System.out.println("Item atualizado");
    }

    @Override
    public void deletarPorId(int id) {
        System.out.println("Item deletado por id");
    }

}
