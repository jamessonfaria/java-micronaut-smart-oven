package br.com.jamesson.smart.oven.m3.factory;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

@Factory
public class MicrowaveFactory {

    @Bean
    Microwave microwave(){
        return new Microwave();
    }


}
