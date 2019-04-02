package com.kd.lombok;

import lombok.Data;

@Data
public class DataAnnotation {
    int age;
    String city;

    public static void main(String[] args) {
        DataAnnotation dataAnnotation = new DataAnnotation();
        System.out.println(dataAnnotation);
    }
}
