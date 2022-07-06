package br.com.jamesson.smart.oven.m4.properties;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;

import javax.annotation.PostConstruct;

@Context
@ConfigurationProperties("lights.default") // - pega os nomes das propriedades e faz o link com atributos
public class LightsProperties {

    //@Property(name = "lights.default.color", defaultValue = "white")
    // @Value("${lights.default.color:white}")
    private String color;

    //@Property(name = "lights.default.dim")
    private Integer dim;

    //@Property(name = "lights.default.enabled")
    private Boolean enabled;

    //@PostConstruct
    public void postConstruct(){
        System.out.println("Color: " + color);
        System.out.println("Dim: " + dim);
        System.out.println("Enabled: " + enabled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDim() {
        return dim;
    }

    public void setDim(Integer dim) {
        this.dim = dim;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
