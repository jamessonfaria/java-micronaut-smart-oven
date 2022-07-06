package br.com.jamesson.smart.oven.m3;


import br.com.jamesson.smart.oven.m3.beans.Oven;
import io.micronaut.context.BeanContext;

public class DIApplication {

    public static void main(String[] args) {
        BeanContext context = BeanContext.run();

        Oven oven = context.getBean(Oven.class);
        oven.turnOn();

    }

}
