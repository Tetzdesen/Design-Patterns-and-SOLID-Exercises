package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tetzner
 */
public class Cedula100 implements ITipoCedula {

    @Override
    public void calcularQuantidadeCedula(ATM atm, double valor) {
        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        int quantidadeCedula100Calculada = valorTotal.divide(BigDecimal.valueOf(100.0), RoundingMode.HALF_UP).intValue();
        
        if (seAplica(atm.getQuantidadeNotasDe100DisponiveisNoCaixa(), quantidadeCedula100Calculada)) {
            atm.setQuantidadeNotasDe100DisponiveisParaSaque(quantidadeCedula100Calculada);
        }
       
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeCedula100Calculada) {
        return quantidadeCedula100Calculada <= quantidadeDisponivel;
    }

}
