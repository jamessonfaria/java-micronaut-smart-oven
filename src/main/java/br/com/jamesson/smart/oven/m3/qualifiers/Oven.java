package br.com.jamesson.smart.oven.m3.qualifiers;

import br.com.jamesson.smart.oven.m3.qualifiers.modes.CookingMode;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class Oven {
    private CookingMode cookingMode;

    @Inject
    //public Oven(@Named("Fan") CookingMode cookingMode) {
    public Oven(@Defrosting CookingMode cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }
}
