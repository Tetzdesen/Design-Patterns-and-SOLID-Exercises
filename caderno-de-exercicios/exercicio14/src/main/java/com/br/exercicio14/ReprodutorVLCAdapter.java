/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exercicio14;

/**
 *
 * @author tetzner
 */
public class ReprodutorVLCAdapter implements IReprodutorMP3 {

    @Override
    public void reproduzir(Arquivo arquivo) {
        Arquivo arquivoAdaptdao = adaptador(arquivo);
        
    }

    private Arquivo adaptador(Arquivo arquivo) {
        return null;
    }

}
