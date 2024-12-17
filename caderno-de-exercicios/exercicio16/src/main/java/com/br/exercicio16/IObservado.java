package com.br.exercicio16;

/**
 *
 * @author tetzner
 */
public interface IObservado {
    public void adicionarObservador(IObservador observador);
    public void removerObservador(IObservador observador);
    public void notificarObservadores();
}
