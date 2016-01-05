package com.home.arvind.animal.kingdom;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.home.arvind.animal.Animal;

@Component
public class KingdomManager {

    @Resource(name = "animalList")
    private List<Animal> animals;

    @PostConstruct
    public void init() {
        this.startShouting();
    }

    public void startShouting() {
        for (Animal animal : animals) {
            animal.shout();
        }
    }

}
