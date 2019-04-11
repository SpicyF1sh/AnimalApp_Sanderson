package com.hsandies.animalapp_sanderson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {


    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.output);

        Duck duck = new Duck();
        Fish fish = new Fish();

        this.output.append("\nDuck say ");
        this.output.append("\nFish goes ");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(fish);

        this.output.append("\nDuck say " + animals.get(0).say());
        this.output.append("\nFish goes " + animals.get(1).say());
        this.output.append("\nThe object at index 1: " + animals.get(1).say());

    }
}
