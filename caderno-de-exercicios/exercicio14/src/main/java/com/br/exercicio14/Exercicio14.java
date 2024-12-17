/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.br.exercicio14;

/**
 *
 * @author tetzner
 */
public class Exercicio14 {

    public static void main(String[] args) {
        
        ReprodutorArquivoService service = new ReprodutorArquivoService();
        
        Arquivo mp3 = new ArquivoMP3IMPL();
        
        Arquivo mp4 = new ArquivoMP4();
        
        Arquivo vlc = new ArquivoVLC();
        
        service.setReprodutor(new ArquivoMP3IMPL());
        
        service.abrir(mp3);
        
        service.setReprodutor(new ReprodutorMP4Adapter());
        
        service.abrir(mp4);

        service.setReprodutor(new ReprodutorVLCAdapter());
        
        service.abrir(vlc);
    }
}
