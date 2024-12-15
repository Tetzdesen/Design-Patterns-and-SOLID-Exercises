package com.br.exercicio7;

/**
 *
 * @author tetzner
 */
public class Cliente {

    private final String nome;
    private final int idade;
    private final int quantidadeAnosConducao;
    private final int quantidadeAcidentesEm5Anos;
    private final int quantidadeBonusSeguro;
    private final int quantidadeVeiculos;

    public Cliente(String nome, int idade, int quantidadeAnosConducao, int quantidadeAcidentesEm5Anos, int quantidadeBonusSeguro, int quantidadeVeiculos) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeAnosConducao = quantidadeAnosConducao;
        this.quantidadeAcidentesEm5Anos = quantidadeAcidentesEm5Anos;
        this.quantidadeBonusSeguro = quantidadeBonusSeguro;
        this.quantidadeVeiculos = quantidadeVeiculos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidadeAnosConducao() {
        return quantidadeAnosConducao;
    }

    public int getQuantidadeAcidentesEm5Anos() {
        return quantidadeAcidentesEm5Anos;
    }

    public int getQuantidadeBonusSeguro() {
        return quantidadeBonusSeguro;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", quantidadeAnosConducao=" + quantidadeAnosConducao + ", quantidadeAcidentesEm5Anos=" + quantidadeAcidentesEm5Anos + ", quantidadeBonusSeguro=" + quantidadeBonusSeguro + ", quantidadeVeiculos=" + quantidadeVeiculos + '}';
    }
}
