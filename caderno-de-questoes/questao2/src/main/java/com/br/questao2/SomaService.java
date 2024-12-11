package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class SomaService {
    
   static double getSomaDosElementosAoQuadrado(ArrayList<Double> numeros) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += Math.pow(numeros.get(counter), 2);
        }
        return total;
    }

    static double getSomaDosElementos(ArrayList<Double> numeros) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += numeros.get(counter);
        }
        return total;
    }
    
}
