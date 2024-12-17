package com.br.exercicio16;

/**
 *
 * @author tetzner
 */
public class UsuarioImpl implements IObservador {
    
    private final String nome;
    private final String email;

    public UsuarioImpl(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void atualizar(String nomeProduto) {
        System.out.println("Olá " + nome + ", o produto " + nomeProduto + " está disponível novamente no estoque ");
    }
    
}
