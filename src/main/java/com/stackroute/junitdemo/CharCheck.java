package com.stackroute.junitdemo;

public class CharCheck {
    public String characterCheck(char input) {
        String output;
        if (input >= 'A' && input <= 'Z') {
            output="Capital";
        }
        else if (input >= 'a' && input <= 'z') {
            output="Small case letter";
        }
        else if (input >= '0' && input <= '9') {
            output="A Digit";
        }
        else {
            output="special character";
        }
        return output;
    }
}
