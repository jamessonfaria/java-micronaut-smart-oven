package br.com.jamesson.smart.oven.m4.configuration;
public class UpdatesSource {

    private UpdatesSourceConfiguration configuration;

    public UpdatesSource(UpdatesSourceConfiguration configuration) {
        this.configuration = configuration;
        System.out.println("New Updates Source: " + configuration.getName()
                + ", " + configuration.getUrl());
    }
}
