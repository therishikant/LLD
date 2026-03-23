package com.rishi.models.document;

public class RealDocument implements Document{
    @Override
    public void read() {
        System.out.println("Reading document...");
    }
}
