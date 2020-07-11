package com.example.jokeslib;

import java.util.Random;

public class MyJokes {
   static String[] myJokes = {"This is my First Joke, Hey! Another Joke, Too many Jokes"};



    public static String getJoke() {
        Random generator = new Random();
        int jokeIndex = generator.nextInt(myJokes.length -1);
        return myJokes[jokeIndex];
    }

}