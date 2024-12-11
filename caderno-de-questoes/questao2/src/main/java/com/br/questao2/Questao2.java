package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public class Questao2 {

    public static void main(String[] args) {
        CalculoEstatisticoService service = new CalculoEstatisticoService(new CalculoMedia());
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.00);
        numeros.add(2.00);
        numeros.add(3.00);
        numeros.add(4.00);
        numeros.add(5.00);
        System.out.println(service.processarMetodoCalculoEstatistico(numeros));
        service.setMetodoCalculoEstatistico(new CalculoValorMaximo());
        System.out.println(service.processarMetodoCalculoEstatistico(numeros));
        
    }
}
