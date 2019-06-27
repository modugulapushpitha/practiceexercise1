package com.stackroute.junitdemo;

public class StringReverse {
        public String reverse(String input)
        {
            String output="";
            int length=input.length();
            for(int i=length-1;i>=0;i--)
            {
                output=output+input.charAt(i);
            }
            return output;
        }
}
