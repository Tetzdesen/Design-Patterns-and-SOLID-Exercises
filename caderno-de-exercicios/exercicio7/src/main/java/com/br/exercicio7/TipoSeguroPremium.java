package com.br.exercicio7;

/**
 *
 * @author tetzner
 */
public class TipoSeguroPremium implements ITipoSeguro {

    @Override
    public Seguro retornaSeguroAdequadoParaCliente(Cliente cliente) {
        Seguro seguro = null;
        if (seAplica(cliente)) {
            seguro = new Seguro("Seguro Premium");
            seguro.adicionarBeneficio("Cobertura de danos a terceiros");
            seguro.adicionarBeneficio("Cobertura de danos ao próprio veículo");
            seguro.adicionarBeneficio("Cobertura contra furto");
        }
        return seguro;
    }

    private boolean seAplica(Cliente cliente) {
        return cliente.getQuantidadeVeiculos() > 2 && (cliente.getIdade() >= 25 && cliente.getIdade() <= 35) && cliente.getBonusSeguro() < 5;
    }
}
