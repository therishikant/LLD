package com.rishi.lld.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Prototype> registry= new HashMap<>();

    public void register(String key, Prototype prototype){
        registry.put(key, prototype);
    }

    public Prototype get(String key){
        return registry.get(key).clone();
    }
}
