package com.br.exercicio16;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        
        ProdutoImpl produto = new ProdutoImpl("Vinicius Cole", false);
        
        UsuarioImpl usuario = new UsuarioImpl("Vinicius Cole", "viniciuscolenarutoonline@gmail.com");
        
        produto.adicionarObservador(usuario);
        
        produto.setDisponivel(true);

    }
}
