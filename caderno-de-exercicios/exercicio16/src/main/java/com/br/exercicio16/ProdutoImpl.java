package com.br.exercicio16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class ProdutoImpl implements IObservado {

    private String nome;

    private boolean disponivel;
    
    private final List<IObservador> observadores;

    public ProdutoImpl(String nome, boolean disponivel) {
        this.nome = nome;
        this.disponivel = disponivel;
        observadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        if(disponivel){
            notificarObservadores();
        }
    }

    @Override
    public void adicionarObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(IObservador observador) {
       observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for(IObservador observador : observadores){
            observador.atualizar(nome);
        }
    }
}
