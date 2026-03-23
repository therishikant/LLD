package com.rishi.models.button;

public class DarkButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a dark button.");
    }
}
