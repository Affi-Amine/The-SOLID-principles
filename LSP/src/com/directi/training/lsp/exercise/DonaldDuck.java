package com.directi.training.lsp.exercise;

public class DonaldDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Donald Duck quacks!");
    }

    @Override
    public void swim() {
        System.out.println("Donald Duck swims!");
    }
}