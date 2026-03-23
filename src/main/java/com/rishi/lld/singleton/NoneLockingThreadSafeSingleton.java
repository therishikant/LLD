package com.rishi.lld.singleton;

public class NoneLockingThreadSafeSingleton {
    private static volatile NoneLockingThreadSafeSingleton instance;

    private NoneLockingThreadSafeSingleton() {
        // Private constructor to prevent instantiation
    }

    private static NoneLockingThreadSafeSingleton getInstance(){
        if (instance == null){
            synchronized (NoneLockingThreadSafeSingleton.class){
                if (instance == null){
                    instance = new NoneLockingThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
