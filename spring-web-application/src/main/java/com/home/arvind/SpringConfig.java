package com.home.arvind;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.home.arvind.animal.Animal;
import com.home.arvind.animal.Cat;
import com.home.arvind.animal.Dog;
import com.home.arvind.animal.Horse;

@Configuration
@ComponentScan(basePackages = {"com.home.arvind"})
public class SpringConfig {

    @Bean(name = "dog")
    @Profile("QA")
    Animal devDog() {
        return new Dog("DEV dog");
    }

    @Bean(name = "dog")
    @Conditional(value = DogCondition.class)
    Animal dog() {
        return new Dog("Generic dog");
    }

    @Bean(name = "cat")
    Animal cat() {
        return new Cat("Cat not specific to any environment");
    }

    @Bean(name = "horse")
    Animal horse() {
        return new Horse("Horse not specific to any environment");
    }

    @Bean
    List<Animal> animalList() {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog());
        animals.add(cat());
        animals.add(horse());
        return animals;
    }
}
