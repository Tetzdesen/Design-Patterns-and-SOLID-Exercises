package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class CalculoEstatisticoService {

    private EstrategiaCalculoEstatistico metodoCalculoEstatistico;
    
    public CalculoEstatisticoService(EstrategiaCalculoEstatistico metodoCalculoEstatistico){
        if(metodoCalculoEstatistico == null){
            throw new IllegalArgumentException("Metodo de calculo estatistico nulo ");
        }
        this.metodoCalculoEstatistico = metodoCalculoEstatistico;
    }
    
    public void setMetodoCalculoEstatistico(EstrategiaCalculoEstatistico metodoCalculoEstatistico){
        if(metodoCalculoEstatistico == null){
            throw new IllegalArgumentException("Metodo de calculo estatistico nulo ");
        }
        this.metodoCalculoEstatistico = metodoCalculoEstatistico;
    }
    
    public double processarMetodoCalculoEstatistico(ArrayList<Double> numeros){
        return metodoCalculoEstatistico.calcular(numeros);
    }
 
}
