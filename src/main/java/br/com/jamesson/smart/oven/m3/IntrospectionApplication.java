package br.com.jamesson.smart.oven.m3;

import br.com.jamesson.smart.oven.m3.introspection.Meal;
import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.beans.BeanProperty;

import java.util.Collection;

public class IntrospectionApplication {

    public static void main(String[] args) {

        BeanIntrospection<Meal> introspection = BeanIntrospection.getIntrospection(Meal.class);

        Meal meal = introspection.instantiate("Pizza", 600, 400);
        System.out.println("Cooking " + meal.getName());

        BeanProperty<Meal, String> mealName = introspection.getRequiredProperty("name", String.class);
        mealName.set(meal, "Pasta");
        System.out.println("Cooking " + meal.getName());

        Collection<BeanProperty<Meal, Object>> beanProperties = introspection.getBeanProperties();
        System.out.println("===== properties ======");
        beanProperties.forEach(e -> System.out.println(e.getName()));

    }

}
