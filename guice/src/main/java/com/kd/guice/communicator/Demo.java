package com.kd.guice.communicator;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kd.guice.communicator.di.CommunicatorModule;

public class Demo {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CommunicatorModule());
        Communicator comms = injector.getInstance(Communicator.class);

        comms.send("hey kd...");
    }
}
