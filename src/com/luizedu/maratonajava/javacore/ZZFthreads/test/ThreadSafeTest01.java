package com.luizedu.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class ThreadSafeName {
//    private final List<String> names = Collections.synchronizedList(new ArrayList<>());
//
//    public void add(String name) {
//        names.add(name);
//    }
//
//    public void removeFirst() {
//        if (!names.isEmpty()) {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(names.remove(0));
//        }
//    }
//
//}

class ThreadSafeName {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }

}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeName threadSafeName = new ThreadSafeName();
        threadSafeName.add("Junkrat");
        Runnable r = threadSafeName::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
