package br.com.jamesson.smart.oven.m3.scopes;

import jakarta.inject.Singleton;

@Singleton
public class Oven1 {
    private Lights lights;

    public Oven1(Lights lights) {
        System.out.println("Calling Oven1 constructor");
        this.lights = lights;
    }

    public void turnOn(){
        System.out.println("Turning on the Oven1");
    }
}
