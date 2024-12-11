package com.br.questao2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tetzner
 */
public final class CalculoValorMinimo implements EstrategiaCalculoEstatistico {

    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.min(numeros);
    }
    
}
