package com.kd.immutables;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ImmutablesDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello...");
        Address address = ImmutableAddress.builder()
                .city("Seattle")
                .street("Mercer")
                .zipcode(98109)
                .build();

        System.out.println(address);

        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = objectMapper.writeValueAsString(address);
        System.out.println(json);

        String k1 = "{\"city\":\"Seattle\",\"street\":\"Mercer\", \"k\":11}";
        Address a2 = objectMapper.readValue(k1, Address.class);
        System.out.println(a2);
    }
}
