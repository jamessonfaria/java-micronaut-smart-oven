package br.com.jamesson.smart.oven.m4.configuration;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;

@Factory
@Context
public class UpdatesSourceFactory {

    @EachBean(UpdatesSourceConfiguration.class)
    UpdatesSource updatesSource(UpdatesSourceConfiguration configuration){
        return new UpdatesSource(configuration);
    }

}

