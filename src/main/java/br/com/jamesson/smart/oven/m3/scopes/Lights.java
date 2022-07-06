package br.com.jamesson.smart.oven.m3.scopes;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton // - unica instancia e inicia quando é invocado (lazy)
//@Context // - unica instancia e inicia quando o micronaut é iniciado (eager)
//@Prototype // - cria cria uma nova instancia toda vez que for injetado
public class Lights {

    public Lights() {
        System.out.println("Calling Lights constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Calling Lights @PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Calling Lights @PreDestroy");
    }
}
