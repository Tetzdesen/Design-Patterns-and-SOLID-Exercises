package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tetzner
 */
public class Cedula50 implements ITipoCedula {

    @Override
    public void calcularQuantidadeCedula(ATM atm, double valor) {

        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(100));

        int quantidadeCedula50Calculada = valorTotal.divide(BigDecimal.valueOf(50.0), RoundingMode.HALF_UP).intValue();

        if (seAplica(atm.getQuantidadeNotasDe50DisponiveisNoCaixa(), quantidadeCedula50Calculada)) {
            atm.setQuantidadeNotasDe50DisponiveisParaSaque(quantidadeCedula50Calculada);
        }
        
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeCedula50Calculada) {
        return quantidadeCedula50Calculada <= quantidadeDisponivel;
    }

}
