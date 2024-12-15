package com.br.exercicio7;

/**
 *
 * @author tetzner
 */
public class TipoSeguroBasico implements ITipoSeguro {

    @Override
    public Seguro retornaSeguroAdequadoParaCliente(Cliente cliente) {
        Seguro seguro = null;
        if(seAplica(cliente)){
            seguro = new Seguro("Seguro Básico");
            seguro.adicionarBeneficio("Cobertura de dados a terceiros ");
        }
        return seguro;
    }
    
    private boolean seAplica(Cliente cliente){
        return cliente.getQuantidadeAnosConducao() > 10 && cliente.getQuantidadeAcidentesEm5Anos() == 0  && cliente.getIdade() > 35;
    }
    
}
