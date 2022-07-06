package br.com.jamesson.smart.oven.m3.introspection;

import io.micronaut.core.annotation.Introspected;

@Introspected // - para usar reflection, pode usar introspeccao dessa classe, ele nao armazena como cache de reflection
public class Meal {
    private String name;
    private Integer secondsToCook;
    private Integer temp;

    public Meal(String name, Integer secondsToCook, Integer temp) {
        this.name = name;
        this.secondsToCook = secondsToCook;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSecondsToCook() {
        return secondsToCook;
    }

    public void setSecondsToCook(Integer secondsToCook) {
        this.secondsToCook = secondsToCook;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }
}
