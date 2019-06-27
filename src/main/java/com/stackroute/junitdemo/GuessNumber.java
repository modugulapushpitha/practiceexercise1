package com.stackroute.junitdemo;

public class GuessNumber{

    public  String guessnum(int randomnum,int guessnum) {

        if (guessnum == randomnum) {
            return "guessed number matches the original";
        } else if (guessnum > randomnum) {
            return "guessed number is greater than the original";

        } else if (guessnum < randomnum) {
            return ("guessed number less than the original");

        }

        return null;
    }

}

