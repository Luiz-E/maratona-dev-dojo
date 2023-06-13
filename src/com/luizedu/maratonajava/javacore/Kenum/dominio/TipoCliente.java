package com.luizedu.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa F�sica"),
    PESSOA_JURIDICA(2, "Pessoa Jur�dica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNome(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
