package br.com.jamesson.smart.oven.m5;

import br.com.jamesson.smart.oven.m4.Application;
import io.micronaut.runtime.Micronaut;

public class AdviceApplication {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
