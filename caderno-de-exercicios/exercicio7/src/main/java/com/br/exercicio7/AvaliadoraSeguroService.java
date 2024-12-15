/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class AvaliadoraSeguroService {
    private final List<ITipoSeguro> tiposSeguro;
    
    public AvaliadoraSeguroService(){
        this.tiposSeguro = new ArrayList<>();
        tiposSeguro.add(new TipoSeguroBasico());
        tiposSeguro.add(new TipoSeguroCompleto());
        tiposSeguro.add(new TipoSeguroPremium());
    }
    
    public Seguro retornaSeguroAdequadoCliente(Cliente cliente){
        Seguro seguro = null;
        for(ITipoSeguro tipoSeguro : tiposSeguro){
            seguro = tipoSeguro.retornaSeguroAdequadoParaCliente(cliente);
            if(seguro != null){
                break;
            }
        }
        return seguro;
    }
}
