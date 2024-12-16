package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moeda001 implements ITipoMoeda {

    @Override
    public int calcularQuantidade(ATM atm, double valor) {

        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(100.00)); // Pega o restante após retirar múltiplos de 100
        valorTotal = valorTotal.remainder(BigDecimal.valueOf(50.00));
        valorTotal = valorTotal.remainder(BigDecimal.valueOf(10.00));
        valorTotal = valorTotal.remainder(BigDecimal.valueOf(1));
        
        int quantidadeMoedas001Calculada = valorTotal.divide(BigDecimal.valueOf(0.01), RoundingMode.HALF_UP).intValue();

        if (seAplica(atm.getQuantidadeMoedasDe001DisponiveisNoCaixa(), quantidadeMoedas001Calculada)) {
            return quantidadeMoedas001Calculada;
        }
        throw new RuntimeException("Quantidade de moedas indisponíveis");
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeMoedas001Calculada) {
        return quantidadeMoedas001Calculada <= quantidadeDisponivel;
    }
}
