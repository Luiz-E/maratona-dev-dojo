package com.luizedu.maratonajava.javacore.Minterfaces.test;

import com.luizedu.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import com.luizedu.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import com.luizedu.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }

}
