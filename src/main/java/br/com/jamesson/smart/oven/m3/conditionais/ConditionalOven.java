package br.com.jamesson.smart.oven.m3.conditionais;

import br.com.jamesson.smart.oven.m3.conditionais.modes.CookingMode;
import io.micronaut.context.annotation.Requires;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Requires(property = "safety.switch.enabled", value = "true")
public class ConditionalOven  {
    private CookingMode cookingMode;

    @Inject
    public ConditionalOven(CookingMode cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }
}
