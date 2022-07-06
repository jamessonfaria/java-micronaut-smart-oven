package br.com.jamesson.smart.oven.m5.introduction;

import br.com.jamesson.smart.oven.m5.introduction.aspect.UpdatesClient;
import io.micronaut.context.annotation.Context;
import io.micronaut.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Context
@UpdatesClient
public abstract class UpdatesControlCenter {

    @UpdatesClient
    public abstract String getLatestVersion();

    //@Scheduled(initialDelay = "1s", fixedDelay = "2s")
    public void checkForUpdates() throws InterruptedException {
        LocalTime start = LocalDateTime.now().toLocalTime();
        System.out.println(start + " Checking for updates...");

        Thread.sleep(3000);

        LocalTime finish = LocalDateTime.now().toLocalTime();
        System.out.println(finish + " Finished checking for update ...");

    }
}
