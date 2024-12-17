package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tetzner
 */
public class Cedula10 implements ITipoCedula {

    @Override
    public void calcularQuantidadeCedula(ATM atm, double valor) {

        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(100));

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(50));

        int quantidadeCedula10Calculada = valorTotal.divide(BigDecimal.valueOf(10.0), RoundingMode.HALF_UP).intValue();

        if (seAplica(atm.getQuantidadeNotasDe10DisponiveisNoCaixa(), quantidadeCedula10Calculada)) {
            atm.setQuantidadeNotasDe10DisponiveisParaSaque(quantidadeCedula10Calculada);
        }
        
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeCedula10Calculada) {
        return quantidadeCedula10Calculada <= quantidadeDisponivel;
    }

}
