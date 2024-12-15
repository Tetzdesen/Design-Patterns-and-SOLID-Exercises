/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exercicio7;

/**
 *
 * @author tetzner
 */
public class Cliente {

    private final String nome;
    private final int idade;
    private final int anosConducao;
    private final int quantidadeAcidentesEm5Anos;
    private final int bonusSeguro;
    private final int quantidadeVeiculos;

    public Cliente(String nome, int idade, int anosConducao, int quantidadeAcidentesEm5Anos, int bonusSeguro, int quantidadeVeiculos) {
        this.nome = nome;
        this.idade = idade;
        this.anosConducao = anosConducao;
        this.quantidadeAcidentesEm5Anos = quantidadeAcidentesEm5Anos;
        this.bonusSeguro = bonusSeguro;
        this.quantidadeVeiculos = quantidadeVeiculos;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosConducao() {
        return anosConducao;
    }

    public int getQuantidadeAcidentesEm5Anos() {
        return quantidadeAcidentesEm5Anos;
    }

    public int getBonusSeguro() {
        return bonusSeguro;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

  
}
