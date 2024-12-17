package com.br.exercicio2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tetzner
 */
public class ATM {

    private final String moeda;

    private int quantidadeNotasDe100DisponiveisNoCaixa;
    private int quantidadeNotasDe50DisponiveisNoCaixa;
    private int quantidadeNotasDe10DisponiveisNoCaixa;
    private int quantidadeMoedasDe1DisponiveisNoCaixa;
    private int quantidadeMoedasDe001DisponiveisNoCaixa;

    private int quantidadeNotasDe100DisponiveisParaSaque;
    private int quantidadeNotasDe50DisponiveisParaSaque;
    private int quantidadeNotasDe10DisponiveisParaSaque;
    private int quantidadeMoedasDe1DisponiveisParaSaque;
    private int quantidadeMoedasDe001DisponiveisParaSaque;

    public ATM(String moeda) {
        if (moeda == null) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.moeda = moeda;
    }

    public String getMoeda() {
        return moeda;
    }

    public int getQuantidadeNotasDe100DisponiveisNoCaixa() {
        return quantidadeNotasDe100DisponiveisNoCaixa;
    }

    public int getQuantidadeNotasDe50DisponiveisNoCaixa() {
        return quantidadeNotasDe50DisponiveisNoCaixa;
    }

    public int getQuantidadeNotasDe10DisponiveisNoCaixa() {
        return quantidadeNotasDe10DisponiveisNoCaixa;
    }

    public int getQuantidadeMoedasDe1DisponiveisNoCaixa() {
        return quantidadeMoedasDe1DisponiveisNoCaixa;
    }

    public int getQuantidadeMoedasDe001DisponiveisNoCaixa() {
        return quantidadeMoedasDe001DisponiveisNoCaixa;
    }
    
     public int getQuantidadeNotasDe100DisponiveisParaSaque() {
        return quantidadeNotasDe100DisponiveisParaSaque;
    }

    public int getQuantidadeNotasDe50DisponiveisParaSaque() {
        return quantidadeNotasDe50DisponiveisParaSaque;
    }

    public int getQuantidadeNotasDe10DisponiveisParaSaque() {
        return quantidadeNotasDe10DisponiveisParaSaque;
    }

    public int getQuantidadeMoedasDe1DisponiveisParaSaque() {
        return quantidadeMoedasDe1DisponiveisParaSaque;
    }

    public int getQuantidadeMoedasDe001DisponiveisParaSaque() {
        return quantidadeMoedasDe001DisponiveisParaSaque;
    } 

    public void setQuantidadeNotasDe100DisponiveisNoCaixa(int quantidadeNotasDe100DisponiveisNoCaixa) {
        if (quantidadeNotasDe100DisponiveisNoCaixa < 0) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.quantidadeNotasDe100DisponiveisNoCaixa = quantidadeNotasDe100DisponiveisNoCaixa;
    }

    public void setQuantidadeNotasDe50DisponiveisNoCaixa(int quantidadeNotasDe50DisponiveisNoCaixa) {
        if (quantidadeNotasDe50DisponiveisNoCaixa < 0) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.quantidadeNotasDe50DisponiveisNoCaixa = quantidadeNotasDe50DisponiveisNoCaixa;
    }

    public void setQuantidadeNotasDe10DisponiveisNoCaixa(int quantidadeNotasDe10DisponiveisNoCaixa) {
        if (quantidadeNotasDe10DisponiveisNoCaixa < 0) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.quantidadeNotasDe10DisponiveisNoCaixa = quantidadeNotasDe10DisponiveisNoCaixa;
    }

    public void setQuantidadeMoedasDe1DisponiveisNoCaixa(int quantidadeMoedasDe1DisponiveisNoCaixa) {
        if (quantidadeMoedasDe1DisponiveisNoCaixa < 0) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.quantidadeMoedasDe1DisponiveisNoCaixa = quantidadeMoedasDe1DisponiveisNoCaixa;
    }

    public void setQuantidadeMoedasDe001DisponiveisNoCaixa(int quantidadeMoedasDe001DisponiveisNoCaixa) {
        if (quantidadeMoedasDe001DisponiveisNoCaixa < 0) {
            throw new IllegalArgumentException("Moeda nula/invalida");
        }
        this.quantidadeMoedasDe001DisponiveisNoCaixa = quantidadeMoedasDe001DisponiveisNoCaixa;
    }
    
    public void setQuantidadeNotasDe100DisponiveisParaSaque(int quantidadeNotasDe100DisponiveisParaSaque) {
        this.quantidadeNotasDe100DisponiveisParaSaque = quantidadeNotasDe100DisponiveisParaSaque;
    }

    public void setQuantidadeNotasDe50DisponiveisParaSaque(int quantidadeNotasDe50DisponiveisParaSaque) {
        this.quantidadeNotasDe50DisponiveisParaSaque = quantidadeNotasDe50DisponiveisParaSaque;
    }

    public void setQuantidadeNotasDe10DisponiveisParaSaque(int quantidadeNotasDe10DisponiveisParaSaque) {
        this.quantidadeNotasDe10DisponiveisParaSaque = quantidadeNotasDe10DisponiveisParaSaque;
    }

    public void setQuantidadeMoedasDe1DisponiveisParaSaque(int quantidadeMoedasDe1DisponiveisParaSaque) {
        this.quantidadeMoedasDe1DisponiveisParaSaque = quantidadeMoedasDe1DisponiveisParaSaque;
    }

    public void setQuantidadeMoedasDe001DisponiveisParaSaque(int quantidadeMoedasDe001DisponiveisParaSaque) {
        this.quantidadeMoedasDe001DisponiveisParaSaque = quantidadeMoedasDe001DisponiveisParaSaque;
    }

}
