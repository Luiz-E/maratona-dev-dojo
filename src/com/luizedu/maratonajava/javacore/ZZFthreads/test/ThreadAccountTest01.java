package com.luizedu.maratonajava.javacore.ZZFthreads.test;

import com.luizedu.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {

    private Account account = new Account();
    private final Account account2 = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("##################################################################");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getThreadName() + " completou o saque. Valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque: " + account.getBalance());
        }
    }

    private void withdrawal2(int amount) {
        synchronized (account2) {
            if (account2.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account2.withdrawal(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getThreadName() + " completou o saque. Valor atual da conta: " + account2.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque: " + account2.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
