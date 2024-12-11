package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class CalculoDesvioPadrao implements EstrategiaCalculoEstatistico {

    @Override
    public double calcular(ArrayList<Double> numeros) {
        double p1 = 1 / Double.valueOf(numeros.size() - 1);
        double p2 = SomaService.getSomaDosElementosAoQuadrado(numeros) - (Math.pow( SomaService.getSomaDosElementos(numeros), 2)
                / Double.valueOf(numeros.size()));
        return Math.sqrt(p1 * p2);
    }

}
