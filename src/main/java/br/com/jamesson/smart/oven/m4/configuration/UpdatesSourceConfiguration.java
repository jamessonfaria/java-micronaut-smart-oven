package br.com.jamesson.smart.oven.m4.configuration;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

import javax.annotation.PostConstruct;

@Context
@EachProperty(value = "updates")
public class UpdatesSourceConfiguration {

    private String name;
    private String url;

    public UpdatesSourceConfiguration(@Parameter String name) {
        this.name = name;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(name + " : " + url);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
