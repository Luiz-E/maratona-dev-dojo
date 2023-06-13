package com.luizedu.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Checando permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize da interface");
    }

}
