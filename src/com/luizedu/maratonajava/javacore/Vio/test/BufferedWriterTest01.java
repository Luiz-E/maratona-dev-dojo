package com.luizedu.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < 500_000; i++) {
                text.append("Escrevendo no arquivo");
            }
            long start = System.currentTimeMillis();
            fw.write(text+"\n");
            fw.flush();
            long end = System.currentTimeMillis();
            System.out.println("File Writer: " + (end-start) + " ms");
            BufferedWriter br = new BufferedWriter(fw);
            start = System.currentTimeMillis();
            br.write(text.toString());
            br.newLine();
            br.flush();
            end = System.currentTimeMillis();
            System.out.println("Buffered Writer: " + (end-start) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
