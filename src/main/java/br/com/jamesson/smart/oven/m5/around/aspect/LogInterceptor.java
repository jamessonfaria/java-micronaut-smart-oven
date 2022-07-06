package br.com.jamesson.smart.oven.m5.around.aspect;

import io.micronaut.aop.InterceptorBean;
import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import jakarta.inject.Singleton;

@Singleton
@InterceptorBean(Log.class)
public class LogInterceptor implements MethodInterceptor<Object, Object> {

    @Override
    public Object intercept(MethodInvocationContext<Object, Object> context) {
        System.out.println("Calling method \"" + context.getMethodName() + "\" with parameters: ");
        context.getParameters()
                .forEach((k, v) -> System.out.println(k + " : " + v.getValue()));
        return context.proceed();
    }
}
