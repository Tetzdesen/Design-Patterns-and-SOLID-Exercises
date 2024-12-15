package com.br.exercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Seguro {
    private String nome;
    private final List<String> beneficios;
    
    public Seguro(String nome){
        this.nome = nome;
        beneficios = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public List<String> getBeneficios(){
        return beneficios;
    }
    
    public void adicionarBeneficio(String beneficio){
        this.beneficios.add(beneficio);
    }

    @Override
    public String toString() {
        return "Seguro{" + "nome=" + nome + ", beneficios=" + beneficios + '}';
    }
    
}
