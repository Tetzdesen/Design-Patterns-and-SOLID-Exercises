package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tetzner
 */
public class Cedula10 implements ITipoCedula {

    @Override
    public int calcularQuantidade(ATM atm, double valor) {

        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(100));

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(50));

        int quantidadeCedula10Calculada = valorTotal.divide(BigDecimal.valueOf(10.0), RoundingMode.HALF_UP).intValue();

        if (seAplica(atm.getQuantidadeNotasDe10DisponiveisNoCaixa(), quantidadeCedula10Calculada)) {
            return quantidadeCedula10Calculada;
        }

        throw new RuntimeException("Quantidade de cedulas indisponiveis ");
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeCedula10Calculada) {
        return quantidadeCedula10Calculada <= quantidadeDisponivel;
    }

}
