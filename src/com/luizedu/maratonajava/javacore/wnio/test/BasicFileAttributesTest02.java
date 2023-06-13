package com.luizedu.maratonajava.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime2 = basicFileAttributes.lastModifiedTime();
        FileTime fileTime1 = basicFileAttributes.lastAccessTime();
        if (true | false ) {

        }

        System.out.println(fileTime);
        System.out.println(fileTime2);
        System.out.println(fileTime1);

    }
}
