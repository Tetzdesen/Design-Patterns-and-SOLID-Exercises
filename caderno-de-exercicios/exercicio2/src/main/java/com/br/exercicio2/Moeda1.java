package com.br.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tetzner
 */
public class Moeda1 implements ITipoMoeda {

    @Override
    public void calcularQuantidadeMoeda(ATM atm, double valor) {

        BigDecimal valorTotal = BigDecimal.valueOf(valor);

        valorTotal = valorTotal.remainder(BigDecimal.valueOf(100)); // Pega o restante após retirar múltiplos de 100
        valorTotal = valorTotal.remainder(BigDecimal.valueOf(50));
        valorTotal = valorTotal.remainder(BigDecimal.valueOf(10));

        int quantidadeMoedas1Calculada = valorTotal.divide(BigDecimal.valueOf(1.0), RoundingMode.HALF_UP).intValue();
        if (seAplica(atm.getQuantidadeMoedasDe1DisponiveisNoCaixa(), quantidadeMoedas1Calculada)) {
            atm.setQuantidadeMoedasDe001DisponiveisParaSaque(quantidadeMoedas1Calculada);
        }
        
    }

    private boolean seAplica(int quantidadeDisponivel, int quantidadeMoedas1Calculada) {
        return quantidadeMoedas1Calculada <= quantidadeDisponivel;
    }

}
