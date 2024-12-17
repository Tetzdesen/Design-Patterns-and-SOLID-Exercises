package com.br.exercicio30;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author tetzner
 */
public class ConfiguracaoSistema {
    private final String nomeSistema;
    private final String caminhoDeConfig;
    private final String resolucao;
    private final LocalDate dataInicializacaoSistema;
    private final LocalTime horaInicializacaoSistema;
    
    private static ConfiguracaoSistema singleInstance = null;
    
    private ConfiguracaoSistema(String nomeSistema, String caminhoDeConfig, String resolucao, LocalDate dataInicializacaoSistema, LocalTime horaInicializacaoSistema) {
        this.nomeSistema = nomeSistema;
        this.caminhoDeConfig = caminhoDeConfig;
        this.resolucao = resolucao;
        this.dataInicializacaoSistema = dataInicializacaoSistema;
        this.horaInicializacaoSistema = horaInicializacaoSistema;
    }
    
    public static ConfiguracaoSistema getInstance(){
        if(singleInstance == null){
            singleInstance = new ConfiguracaoSistema("AAA", "AAA", "AAA", LocalDate.now(), LocalTime.now());
        }
        return singleInstance;
    }
  
}
