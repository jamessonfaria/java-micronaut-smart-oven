package br.com.jamesson.smart.oven.m3.beans;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Oven {

    //@Inject - injecao por atributo
    private Lights lights;
    //@Inject - injecao por atributo
    private Grill grill;

    // injecao por construtor (MAIS RECOMENDADO)
    @Inject
    public Oven(Lights lights, Grill grill) {
        this.lights = lights;
        this.grill = grill;
    }

    public void turnOn(){
        System.out.println("Turning on the Over");
        lights.turnOn();;
        grill.turnOn();
    }

    public Lights getLights() {
        return lights;
    }

    //@Inject - injecao por setter
    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public Grill getGrill() {
        return grill;
    }

    //@Inject - injecao por setter
    public void setGrill(Grill grill) {
        this.grill = grill;
    }
}
