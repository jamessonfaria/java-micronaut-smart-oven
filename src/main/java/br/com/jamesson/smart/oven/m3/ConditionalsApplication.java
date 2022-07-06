package br.com.jamesson.smart.oven.m3;

import br.com.jamesson.smart.oven.m3.conditionais.ConditionalOven;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.PropertySource;

import static io.micronaut.context.env.PropertySource.mapOf;

public class ConditionalsApplication {

    public static void main(String[] args) {

        ApplicationContext appContext = ApplicationContext.run(
                PropertySource.of("default", mapOf("safety.switch.enabled", "true")));

        ConditionalOven oven = appContext.getBean(ConditionalOven.class);
        oven.setCookingMode();
    }

}
