package com.rishi.lld.builder;

public class Driver {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setEmail("the@gmail.com")
                .setFirstName("Rishi")
                .setLastName("Singh")
                .setPhoneNumber("1234567890")
                .build();
    }
}
