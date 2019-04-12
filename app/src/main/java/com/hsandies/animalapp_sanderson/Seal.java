package com.hsandies.animalapp_sanderson;

public class Seal extends Animal implements Animal.Fun {
    @Override
    public String say() {
        return("ow ow ow");
    }

    public Seal(){

    }

    @Override
    public String play() {
        return("The seal bounces a ball off its nose.");
    }
}
