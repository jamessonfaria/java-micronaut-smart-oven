package br.com.jamesson.smart.oven.m3;

import br.com.jamesson.smart.oven.m3.scopes.Oven1;
import br.com.jamesson.smart.oven.m3.scopes.Oven2;
import br.com.jamesson.smart.oven.m3.scopes.Oven3;
import io.micronaut.context.ApplicationContext;

public class LifecycleApplication {

    public static void main(String[] args) {

        ApplicationContext appContext = ApplicationContext.run();
        System.out.println("Application started");

        Oven1 oven1 = appContext.getBean(Oven1.class);
        Oven2 oven2 = appContext.getBean(Oven2.class);
        Oven3 oven3 = appContext.getBean(Oven3.class);

        oven1.turnOn();
        oven2.turnOn();
        oven3.turnOn();

        appContext.stop();
    }

}
