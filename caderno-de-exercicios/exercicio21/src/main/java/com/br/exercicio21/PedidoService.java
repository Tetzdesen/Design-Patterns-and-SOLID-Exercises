/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exercicio21;

/**
 *
 * @author tetzner
 */
public final class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    
    public void criarPedido(Pedido pedido){
        pedidoRepository.criar(pedido);
    }
    
    public Pedido lerPedido(int id){
        return pedidoRepository.ler(id);
    }
    
    public void atualizarPedido(Pedido pedido){
        pedidoRepository.atualizar(pedido);
    }
    
    public void deletarPedido(int id){
        pedidoRepository.deletar(id);
    }
   
}
