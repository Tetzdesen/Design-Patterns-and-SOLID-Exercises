package com.br.questao2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tetzner
 */
public final class CalculoValorMaximo implements EstrategiaCalculoEstatistico {

    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.max(numeros);
    }
    
}
