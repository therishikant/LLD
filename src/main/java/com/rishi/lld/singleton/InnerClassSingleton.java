package com.rishi.lld.singleton;

public class InnerClassSingleton {
    private InnerClassSingleton(){
        // Private constructor to prevent instantiation
    }

    private static class Holder{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return Holder.instance;
    }
}
