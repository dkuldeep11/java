package com.kd.guice.communicator;

import com.google.inject.Inject;

public class Communicator {

    @Inject
    private Sender sender;

    public void send(final String msg) {
        sender.send(msg);
    }
}
