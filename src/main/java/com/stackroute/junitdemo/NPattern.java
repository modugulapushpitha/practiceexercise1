package com.stackroute.junitdemo;

public class NPattern {
    public String  nrepeat(int input){
        int j;
        String output="";
        for (int i = 1; i <= input; i++) {
            for (j = 1; j <= i;j++ ) {
                output=output+i+" ";
            }
        }
        return output;
    }
}
