package br.com.jamesson.smart.oven.m3.beans;

import jakarta.inject.Singleton;

@Singleton
public class Grill {
    public void turnOn(){
        System.out.println("Turning on the Grill");
    }
}
