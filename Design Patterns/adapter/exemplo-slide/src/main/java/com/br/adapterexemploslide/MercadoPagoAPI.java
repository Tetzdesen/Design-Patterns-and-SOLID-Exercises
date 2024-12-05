/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.adapterexemploslide;

import java.util.Random;

/**
 *
 * @author tetzner
 */
public class MercadoPagoAPI {
        
    private static final String[] ERROS = {"Servidor indisponível",
       "Saldo insuficiente",
       "Conta bloqueada",
       "Dados inválidos",
       "Limite de transações excedido"};
    
    public void efetuarPagamento(double valor){
        Random random = new Random();
        
        boolean aprovado = random.nextBoolean();
        
        if(aprovado){
            System.out.println("Pagamento aprovado via Mercado Pago de R$: " + valor);
        } else {
            int indiceErro = random.nextInt(ERROS.length);
            System.out.println("Mercado pago pagamento de R$: " + valor + " Reprovado por " + ERROS[indiceErro]);        
        }
    }
}
