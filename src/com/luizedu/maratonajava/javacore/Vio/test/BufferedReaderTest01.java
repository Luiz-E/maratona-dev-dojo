package com.luizedu.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr))
        {
            long start = System.currentTimeMillis();
            int i;
            while ((i = fr.read()) != -1) {}
            long end = System.currentTimeMillis();

            System.out.println("File Reader: " + (end-start) + " ms");

            start = System.currentTimeMillis();
            String linha;
            while ((linha = br.readLine()) != null) {}
            end = System.currentTimeMillis();
            System.out.println("Buffered Reader: " + (end-start) + " ms");

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
