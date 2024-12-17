package com.br.exercicio2;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {

        ATM atm = new ATM("R$");
        
        ATMService atmService = new ATMService(); 

        atm.setQuantidadeNotasDe100DisponiveisNoCaixa(5);
        atm.setQuantidadeNotasDe50DisponiveisNoCaixa(2);
        atm.setQuantidadeNotasDe10DisponiveisNoCaixa(5);
        atm.setQuantidadeMoedasDe1DisponiveisNoCaixa(5);
        atm.setQuantidadeMoedasDe001DisponiveisNoCaixa(5);

        double valorSaque = 52.02;

        if (valorSaque >= 0) {
            atmService.calcularQuantidadeCedula(atm, valorSaque);
            atmService.calcularQuantidadeMoeda(atm, valorSaque);
            System.out.println("VALOR DO SAQUE: " + atm.getMoeda() + " " + valorSaque);
            System.out.println(atm.getQuantidadeNotasDe100DisponiveisParaSaque() + " nota(s) de " + atm.getMoeda() + " 100.00 real(ais)");
            System.out.println(atm.getQuantidadeNotasDe50DisponiveisParaSaque() + " nota(s) de " + atm.getMoeda() + " 50.00 real(ais)");
            System.out.println(atm.getQuantidadeNotasDe10DisponiveisParaSaque() + " nota(s) de " + atm.getMoeda() + " 10.00 real(ais)");
            System.out.println(atm.getQuantidadeMoedasDe1DisponiveisParaSaque() + " moeda(s) de " + atm.getMoeda() + " 1.00 real");
            System.out.println(atm.getQuantidadeMoedasDe001DisponiveisParaSaque() + " moeda(s) de " + atm.getMoeda() + " 0.01 centavo(s)");
        }

    }
}
