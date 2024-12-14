package com.br.solidexamples.srp.resolucao;

/**
 *
 * @author tetzner
 */

public class ProcessaPedido {
    
    private IEmailPedido emailPedido;
    private IPedidoDAO pedidoDAO;
    
    public ProcessaPedido(IPedidoDAO pedidoDAO, IEmailPedido emailPedido){
        this.pedidoDAO = pedidoDAO;
        this.emailPedido = emailPedido;
    }

    public void setEmailPedido(IEmailPedido emailPedido) {
        this.emailPedido = emailPedido;
    }

    public void setPedidoDAO(IPedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }
    
    public void processar(Pedido pedido) {
        // Regra de negócio processar pedido

        boolean persistidoBanco = pedidoDAO.salvar(pedido);

        if (pedido.isValid() && persistidoBanco) {
            emailPedido.enviarEmailConfirmacao(pedido);
        }
    }
 
}
