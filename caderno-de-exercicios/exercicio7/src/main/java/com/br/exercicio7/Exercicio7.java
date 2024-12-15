package com.br.exercicio7;

/**
 *
 * @author tetzner
 */
public class Exercicio7 {

    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Kurt Cobain", 25, 10, 1, 2, 2);

            AvaliadoraSeguroService avaliadoraSeguro = new AvaliadoraSeguroService();
            Seguro seguro = avaliadoraSeguro.retornaSeguroAdequadoCliente(cliente);
            System.out.println(seguro.toString());
        } catch(Exception e){
            System.out.println("Seguro nulo");
        }

    }
}
