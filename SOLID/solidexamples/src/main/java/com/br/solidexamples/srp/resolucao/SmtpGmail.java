package com.br.solidexamples.srp.resolucao;

/**
 *
 * @author tetzner
 */
public class SmtpGmail implements Smtp {

    public SmtpGmail(String usuario, String senha) {
        // Configurando conexão smtp
    }

    @Override
    public void enviar(String html, String mail) {
        System.out.println("Enviando e-mail de confirmação📧: ".concat(html));
        // Send e-mail📧
    }
}
