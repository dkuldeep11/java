package com.kd.guice.communicator;

public class EmailSender implements Sender {

    @Override
    public void send(String msg) {
        System.out.println("emailing ..." + msg);
    }
}
