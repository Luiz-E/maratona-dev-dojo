package com.luizedu.maratonajava.javacore.Aintroducaoclasses.test;

import com.luizedu.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 21;
        student.gender = 'M';

        System.out.println(student);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

    }
}
