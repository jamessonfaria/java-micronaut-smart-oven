package br.com.jamesson.smart.oven.m5.introduction.aspect;

import io.micronaut.aop.Introduction;
import io.micronaut.context.annotation.Bean;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Introduction // - dessa forma considera updatesclient como um advise introdutorio
@Bean // - todas as classes anotadas com updatesclient se tornem beans
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, ANNOTATION_TYPE, METHOD})
public @interface UpdatesClient {
}
