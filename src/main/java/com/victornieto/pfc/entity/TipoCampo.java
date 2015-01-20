package com.victornieto.pfc.entity;

/**
 *
 * @author victor
 */
public enum TipoCampo {
    CADENA("C"), NUMERO("N"), BOOLEANO("B") ;
    
    private String valor ;

    private TipoCampo(String valor) {
        this.valor = valor;
    }
}
