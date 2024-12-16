package com.br.exercicio2;

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

    public int calcularQuantidadeCedula(ATM atm, ITipoCedula tipoCedula, double valor) {
        if (atm == null || tipoCedula == null || valor < 0.0) {
            throw new IllegalArgumentException("Dados inválidos ou nulos");
        }
        return tipoCedula.calcularQuantidade(atm, valor);
    }

    public int calcularQuantidadeMoeda(ATM atm, ITipoMoeda tipoMoeda, double valor) {
        if (atm == null || tipoMoeda == null || valor < 0.0) {
            throw new IllegalArgumentException("Dados inválidos ou nulos");
        }
        return tipoMoeda.calcularQuantidade(atm, valor);
    }
}
