package br.com.jamesson.smart.oven.m5.introduction;

import io.micronaut.context.annotation.Context;
import jakarta.inject.Inject;

import javax.annotation.PostConstruct;

@Context
public class Oven {

    private UpdatesControlCenter updatesControlCenter;

    @Inject
    public Oven(UpdatesControlCenter updatesControlCenter) {
        this.updatesControlCenter = updatesControlCenter;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(updatesControlCenter.getLatestVersion());
    }
}
