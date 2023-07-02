package com.luizedu.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

//class Cachorro extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Cachorro walking");
//    }
//}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("walking in the shadows");
                jump();
            }
            public void jump() {
                System.out.println("Jumping");
            }
        };
        animal.walk();
        //animal.jump();
    }
}
