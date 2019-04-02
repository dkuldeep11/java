package com.kd.serde.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street, city;
    private int zipcode;

    public static void main(String[] args) {
        Address a1 = new Address("mercer", "Pune", 111);
        System.out.println(a1);

        ObjectMapper objectMapper = new ObjectMapper();
        // SER
        String sa1 = null;
        try {
            sa1 = objectMapper.writeValueAsString(a1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("JSON = " + sa1);

        // DESER
        try {
            String k1 = "{\"street\":\"mercer\",\"city\":\"Pune\",\"zipcode\":111}, \"k1\":100";
            Address a2 = objectMapper.readValue(k1, Address.class);
            System.out.println(a2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
