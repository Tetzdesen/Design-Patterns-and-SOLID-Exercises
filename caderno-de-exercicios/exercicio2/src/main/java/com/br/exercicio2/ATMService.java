package com.br.exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class ATMService {

    private final List<ITipoCedula> tipoCedulas;
    private final List<ITipoMoeda> tipoMoedas;

    public ATMService() {
        tipoCedulas = new ArrayList<>();
        tipoMoedas = new ArrayList<>();
        tipoCedulas.add(new Cedula100());
        tipoCedulas.add(new Cedula50());
        tipoCedulas.add(new Cedula10());
        tipoMoedas.add(new Moeda1());
        tipoMoedas.add(new Moeda001());
    }

    public void calcularQuantidadeCedula(ATM atm, double valor) {
        
        if (atm == null || valor < 0.0) {
            throw new IllegalArgumentException("Dados inválidos ou nulos");
        }

        for (ITipoCedula tipoCedula : tipoCedulas) {
            tipoCedula.calcularQuantidadeCedula(atm, valor);
        }

    }

    public void calcularQuantidadeMoeda(ATM atm, double valor) {
        if (atm == null || valor < 0.0) {
            throw new IllegalArgumentException("Dados inválidos ou nulos");
        }
        for (ITipoMoeda tipoMoeda : tipoMoedas) {
            tipoMoeda.calcularQuantidadeMoeda(atm, valor);
        }

    }
    
    public void adicionarTipoCedula(ITipoCedula tipoCedula){
        tipoCedulas.add(tipoCedula);
    }
    
    public void adicionarTipoMoeda(ITipoMoeda tipoMoeda){
        tipoMoedas.add(tipoMoeda);
    }
}
