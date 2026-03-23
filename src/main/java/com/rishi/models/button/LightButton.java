package com.rishi.models.button;

public class LightButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a light button.");
    }
}
