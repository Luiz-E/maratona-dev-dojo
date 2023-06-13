package com.luizedu.maratonajava.javacore.Aintroducaoclasses.test;

import com.luizedu.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.printf("%s %d %c", professor.name, professor.age, professor.gender);
    }
}
