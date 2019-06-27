package com.stackroute.junitdemo;

public class PalindromeCheck {
    public String checkPalindrome(int input) {
        int temp;
        String output1="Success";
        String output2="Failure";
        int out = 0;
        temp =input;
        int sum = 0;
        while (input > 0) {
            int mod = input% 10;
            input = input/ 10;
            out = out * 10 +mod;
            if (mod % 2 == 0) {
                sum= sum + mod;
            }
        }
        if (out == temp) {
            if (sum> 25) {
                return output1;
            } else {
                return output2;
            }
        } else {
            return output2;
        }
    }
}
