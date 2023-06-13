package com.luizedu.maratonajava.javacore.wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
//        BasicFileAttributes;      Básico
//        DosFileAttributes;        Windows
//        PosixFileAttributes;      Linux

        LocalDateTime date = LocalDateTime.now().minusMinutes(10);
        File file = new File("pasta2/novo.txt");
        file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(isModified);

        Path path = Paths.get("pasta2/novo_pasth.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
    }
}
