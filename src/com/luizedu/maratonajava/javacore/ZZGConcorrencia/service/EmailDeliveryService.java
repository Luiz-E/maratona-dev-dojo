package com.luizedu.maratonajava.javacore.ZZGConcorrencia.service;

import com.luizedu.maratonajava.javacore.ZZGConcorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable{

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
        System.out.println(thread + " starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() >= 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;

                System.out.println(thread + " enviando email para " + email);

                Thread.sleep(2000);

                System.out.println(thread + " enviou email para email");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Todos emails enviados");
    }
}
