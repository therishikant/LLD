package com.rishi.lld.prototypeRegistry;

import java.sql.Timestamp;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Timestamp(System.currentTimeMillis()));
        Prototype prototype = new Invoice("header", "footer");
        System.out.println(new Timestamp(System.currentTimeMillis()));

        Registry registry = new Registry();
        registry.register("invoice", prototype);

        Prototype clone1 = registry.get("invoice");
        Prototype clone2 = registry.get("invoice");
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(new Timestamp(System.currentTimeMillis()));

    }
}
