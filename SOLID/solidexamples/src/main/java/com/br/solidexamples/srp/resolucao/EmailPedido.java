package com.br.solidexamples.srp.resolucao;

/**
 *
 * @author tetzner
 */
public class EmailPedido implements IEmailPedido {
    
    private Smtp smtp;
    
    public EmailPedido(SmtpGmail smtp){      
        this.smtp = smtp; 
    }

    public void setSmtp(Smtp smtp) {
        this.smtp = smtp;
    }
    
    @Override
    public void enviarEmailConfirmacao(Pedido pedido) {

        String nome = pedido.getNomeCliente();
        String email = pedido.getEmailCliente();

        String html = "Caro cliente ".concat(nome).concat(", seu Pedido ")
                .concat(pedido.getId().toString()).concat(" foi confirmado!😎");

        smtp.enviar(html, email);
    }
    
}
