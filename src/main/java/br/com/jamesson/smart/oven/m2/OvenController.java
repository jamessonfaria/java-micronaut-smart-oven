package br.com.jamesson.smart.oven.m2;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class OvenController {

    @Get("/status/{ovenId}")
    public String getOvenStatus(String ovenId){
        return "OK";
    }

}
