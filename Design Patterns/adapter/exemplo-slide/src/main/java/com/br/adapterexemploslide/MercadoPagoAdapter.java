/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.adapterexemploslide;

/**
 *
 * @author tetzner
 */
public class MercadoPagoAdapter implements IFormaDePagamento {
    private final MercadoPagoAPI mercadoPagoAPI;
    
    
    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI){
        this.mercadoPagoAPI = mercadoPagoAPI;
    }
    
    @Override
    public void realizarPagamento(double valor) {
       mercadoPagoAPI.efetuarPagamento(valor);
    }
    
}
