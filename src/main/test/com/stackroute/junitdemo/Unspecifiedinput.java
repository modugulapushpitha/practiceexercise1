package com.stackroute.junitdemo;
import java.util.Scanner;
    public class Unspecifiedinput {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int sum=0;
            while (scan.hasNext() && (!("\n").equals(scan.hasNext()))) {
                sum = sum + scan.nextInt();

            }

            System.out.println(sum);
        }
    }

