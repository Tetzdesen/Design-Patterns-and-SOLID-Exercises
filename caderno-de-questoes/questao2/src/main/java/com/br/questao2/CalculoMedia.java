package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class CalculoMedia implements EstrategiaCalculoEstatistico {

    @Override
    public double calcular(ArrayList<Double> numeros) {
        double total = 0;
            for (int i = 0; i < numeros.size(); i++) {
            total += numeros.get(i);
            }
            return total / numeros.size();
    }
    
}
