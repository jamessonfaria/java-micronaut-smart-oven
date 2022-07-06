package br.com.jamesson.smart.oven.m3.conditionais.modes;

import jakarta.inject.Singleton;

@Singleton
public class FanCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Fan Cooking mode");
    }
}
