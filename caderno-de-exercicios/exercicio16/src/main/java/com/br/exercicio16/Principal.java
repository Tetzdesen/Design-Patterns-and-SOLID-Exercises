package com.br.exercicio16;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        
        ProdutoImpl produto = new ProdutoImpl("Teste", false);
        
        UsuarioImpl usuario = new UsuarioImpl("Teste", "Teste@gmail.com");
        
        produto.adicionarObservador(usuario);
        
        produto.setDisponivel(true);

    }
}
