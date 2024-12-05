/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.adapterexemploslide;

/**
 *
 * @author tetzner
 */
public class PayPalAdapter implements IFormaDePagamento {
    private final PayPalAPI payPalAPI;
    
    public PayPalAdapter(PayPalAPI payPalAPI){
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void realizarPagamento(double valor) {
        payPalAPI.sendPayment(valor);
    }    
    
}
