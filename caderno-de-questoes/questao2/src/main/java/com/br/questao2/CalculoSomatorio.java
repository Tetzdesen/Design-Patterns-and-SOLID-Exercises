package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class CalculoSomatorio implements EstrategiaCalculoEstatistico {

    @Override
    public double calcular(ArrayList<Double> numeros) {
        return SomaService.getSomaDosElementos(numeros);
    }

}
