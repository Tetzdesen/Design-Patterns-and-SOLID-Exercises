/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.adapterexemploslide;

import java.util.Random;

/**
 *
 * @author tetzner
 */
public class AdapterExemploSlide {

    public static void main(String[] args) {
        Random random = new Random();
        // Criando instancias da API
        
        PayPalAPI payPalAPI = new PayPalAPI();
        MercadoPagoAPI mercadoPagoAPI = new MercadoPagoAPI();
        
        // criando instancias de Adapter
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalAPI);
        MercadoPagoAdapter mercadoPagoAdapter = new MercadoPagoAdapter(mercadoPagoAPI);
        
        GerenciadorDePagamento gerenciadorDePagamentos = GerenciadorDePagamento.getInstance();
        gerenciadorDePagamentos.processarPagamento(payPalAdapter, random.nextDouble(0, 50000));
        gerenciadorDePagamentos.processarPagamento(mercadoPagoAdapter, random.nextDouble(0, 50000));
    }
}
