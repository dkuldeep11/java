package com.kd.guice.communicator.di;

import com.google.inject.AbstractModule;
import com.kd.guice.communicator.EmailSender;
import com.kd.guice.communicator.Sender;

public class CommunicatorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Sender.class).to(EmailSender.class);
    }
}
