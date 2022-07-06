package br.com.jamesson.smart.oven.m3.qualifiers.modes;

import jakarta.inject.Singleton;

@Singleton
public class DefrostingCookingMode implements CookingMode{
    @Override
    public void setCookingMode() {
        System.out.println("Setting Defrosting Cooking mode");
    }
}
