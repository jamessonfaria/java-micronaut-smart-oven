package br.com.jamesson.smart.oven.m5.introduction.aspect;

import io.micronaut.aop.InterceptorBean;
import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import jakarta.inject.Singleton;

@Singleton
@InterceptorBean(UpdatesClient.class)
public class UpdatesInterceptor implements MethodInterceptor<Object, Object> {

    @Override
    public Object intercept(MethodInvocationContext<Object, Object> context) {
        return "Version: 1.0.0";
    }
}
