package com.stackroute.junitdemo;

public class StringNRepeat {
    public String repeatString(String input1, int input2) {
        int len = input1.length();
        int i, j;
        String str = "";
        if (input2 < len) {
            for (i = len - input2; i <= (len - 1); i++) {
                str = str + input1.charAt(i);
            }
            for (j = 1; j <= input2; j++) {
                input1 = input1 + str;
            }
            return input1;
        } else {
            return "input2 should be less than length of input1";
        }
    }
}
