package br.com.jamesson.smart.oven.m3.factory;

import jakarta.inject.Singleton;

@Singleton
public class CombiOven {

    private final Microwave microwave;

    public CombiOven(Microwave microwave) {
        this.microwave = microwave;
    }

    public void turnOnMicrowave(){
        microwave.turnOn();
    }

    public void turnOnOven(){
        System.out.println("Turning on the Oven");
    }
}
