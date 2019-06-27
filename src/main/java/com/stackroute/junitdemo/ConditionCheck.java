package com.stackroute.junitdemo;

public class ConditionCheck {
    public String conditionCheck(int input)
    {
        String output="";
        if((input%2==0)&&(input>=20&&input<=30))
            output="Jerry";
        else if((input%2!=0)&&(input>=20&&input<=30))
            output="Tom";
        return output;

    }
}
