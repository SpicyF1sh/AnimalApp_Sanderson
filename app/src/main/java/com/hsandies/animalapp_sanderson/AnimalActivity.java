package com.hsandies.animalapp_sanderson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    private TextView output;

    Duck duck = new Duck();
    Fish fish = new Fish();
    Seal seal = new Seal();
    Fox fox = new Fox();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.output);


        this.output.append("\nDuck say ");
        this.output.append("\nFish goes ");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);

        String[] words = {"\nDuck say ", "\nFish goes "};

        /*for (int i = 0; 1 < animals.size(); i++){
            this.output.append(words[i] + animals.get(i).say());
        }

        this.output.append("\nThe object at index 1: " + animals.get(1).say());*/

        for(Animal printanimals : animals){
            this.output.append("\n" + printanimals.getClass().getSimpleName() + " goes " + printanimals.say());
            if (printanimals instanceof Seal) {
                this.output.append("\n" + ((Seal)printanimals).play());
            }
            if (printanimals instanceof Fox) {
                this.output.append("\n" + ((Fox)printanimals).play());
            }
        }


    }
}
