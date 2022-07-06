package br.com.jamesson.smart.oven.m3.conditionais.modes;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;

@Singleton
@Replaces(FanCookingMode.class)
public class UpdateFanCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Update Fan Cooking mode");
    }
}
