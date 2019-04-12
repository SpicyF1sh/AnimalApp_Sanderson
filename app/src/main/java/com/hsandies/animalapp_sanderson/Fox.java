package com.hsandies.animalapp_sanderson;

import java.util.ArrayList;
import java.util.Random;

public class Fox extends Animal implements Animal.Fun {
        @Override
        public String say() {
            ArrayList<String> saying = new ArrayList<>();
            saying.add("Ring-ding-ding-ding-dingeringeding!");
            saying.add("Jacha-chacha-chacha-chow!");
            saying.add("Wa-pa-pa-pa-pa-pa-pow!");
            saying.add("Hatee-hatee-hatee-ho!");
            saying.add("Joff-tchoff-tchoffo-tchoffo-tchoff!");
            saying.add("Fraka-kaka-kaka-kaka-kow!");
            saying.add("A-hee-ahee ha-hee!");
            Random x = new Random();
            int y = x.nextInt(7);
            return(saying.get(y));
        }

        public Fox(){

        }


        @Override
        public String play() {
            return("The fox chases mice and digs holes!");
        }
}
