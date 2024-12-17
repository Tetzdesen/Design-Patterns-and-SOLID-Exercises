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
    
    public Seguro processaSeguroAdequadoParaCliente(Cliente cliente){
        Seguro seguro = null;
        for(ITipoSeguro tipoSeguro : tiposSeguro){
            seguro = tipoSeguro.retornaSeguroAdequadoParaCliente(cliente);
            if(seguro != null){
                break;
            }
        }
        return seguro;
    }
    
    public void addTipo(ITipoSeguro tipoSeguro){
        if(tiposSeguro == null){
            throw new IllegalArgumentException("tipo de seguro nulo ");
        }
        tiposSeguro.add(tipoSeguro);
    }
}
