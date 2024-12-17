/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exercicio14;

/**
 *
 * @author tetzner
 */
public class ReprodutorArquivoService {

    private IReprodutorMP3 reprodutor;

    public void abrir(Arquivo arquivo) {
        reprodutor.reproduzir(arquivo);
    }

    public void setReprodutor(IReprodutorMP3 reprodutor) {
        this.reprodutor = reprodutor;
    }

}
