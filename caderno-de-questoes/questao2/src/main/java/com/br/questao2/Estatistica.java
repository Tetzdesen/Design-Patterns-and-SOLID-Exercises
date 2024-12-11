package com.br.questao2;

import java.util.ArrayList;

/**
 *
 * @author tetzner
 */
public final class Estatistica {

    private final ArrayList<Double> meusNumeros;
    private final double media;
    private final double somatorio;
    private final double maximo;
    private final double minimo;
    private final double variancia;
    private final double desvioPadrao;

    public Estatistica(ArrayList<Double> meusNumeros, double media, double somatorio, double maximo, double minimo, double variancia, double desvioPadrao) {
        this.meusNumeros = meusNumeros;
        this.media = media;
        this.somatorio = somatorio;
        this.maximo = maximo;
        this.minimo = minimo;
        this.variancia = variancia;
        this.desvioPadrao = desvioPadrao;
    }

    public double getMedia() {
        return media;
    }

    public double getSomatorio() {
        return somatorio;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getVariancia() {
        return variancia;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

}
