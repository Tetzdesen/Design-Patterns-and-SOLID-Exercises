package com.br.solidexamples.srp.resolucao;

import com.br.solidexamples.srp.resolucao.ConexaoPostgres;

/**
 *
 * @author tetzner
 */
public class PedidoDAOPostgres implements IPedidoDAO {
    
    private final ConexaoPostgres dbConnection;
    
    public PedidoDAOPostgres() {
        this.dbConnection = new ConexaoPostgres("database.url");
    }

    @Override
    public boolean salvar(Pedido pedido) {
        try {
            
           // usar connection para inserir no postgres
           System.out.println("Salvando pedido no POSTGRES...");
            // Persistindo dados no banco real
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }
    
}
