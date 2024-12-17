package com.br.exercicio20;

import java.util.List;

/**
 *
 * @author tetzner
 */
public class PedidoDAOMySQL implements PedidoDAO{

    @Override
    public void inserir(Pedido pedido) {
        System.out.println("Inserindo dados no mysql na tabela de pedido");
    }

    @Override
    public Pedido buscarPorId(int id) {
        System.out.println("Pedido por id encontrado");
        return null;
    }

    @Override
    public List<Pedido> listarTodos() {
       System.out.println("Pedidos listado e retornados ");
       return null;
    }

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Pedido atualizado");
        
    }

    @Override
    public void deletar(int id) {
        System.out.println("Pedido deletado por id");
    }
    
}
