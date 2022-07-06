package br.com.jamesson.smart.oven.m5.around;


import io.micronaut.context.annotation.Context;
import jakarta.inject.Inject;
import javax.annotation.PostConstruct;

@Context
public class Oven {

    private Controls controls;

    @Inject
    public Oven(Controls controls) {
        this.controls = controls;
    }

    @PostConstruct
    public void postConstruct(){
        controls.setControls("10m", 600);
        controls.setControls("22m", 200);
    }
}
