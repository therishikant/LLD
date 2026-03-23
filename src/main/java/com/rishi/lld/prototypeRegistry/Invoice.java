package com.rishi.lld.prototypeRegistry;

public class Invoice implements Prototype{
    private String header;
    private String footer;

    public Invoice(String header, String footer) throws InterruptedException {
        System.out.println("Object creation Started");
        Thread.sleep(1000);
        this.header = header;
        this.footer = footer;
        Thread.sleep(1000);
        System.out.println("Object creation finished");
    }

    @Override
    public Prototype clone() {
        try {
            return (Invoice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
