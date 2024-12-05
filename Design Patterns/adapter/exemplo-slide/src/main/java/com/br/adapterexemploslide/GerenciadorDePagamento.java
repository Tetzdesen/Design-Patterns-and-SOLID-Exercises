/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.adapterexemploslide;

/**
 *
 * @author tetzner
 */
public class GerenciadorDePagamento {
    private static GerenciadorDePagamento singleInstance = null;
    
    private GerenciadorDePagamento(){
        
    }
    
    public static GerenciadorDePagamento getInstance(){
        if(singleInstance == null){
            singleInstance = new GerenciadorDePagamento();
        }
        return singleInstance;
    }
    
    public void processarPagamento(IFormaDePagamento formaPagamento, double valor){
        formaPagamento.realizarPagamento(valor);
    }
}
