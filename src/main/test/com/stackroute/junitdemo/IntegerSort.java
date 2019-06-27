package com.stackroute.junitdemo;
import java.util.Arrays;
public class IntegerSort {
    public String sortTheNumber(int number){
        int temp=number;
        int r,rem;
        int c=0,even=0,i=0,sorted=0;
        while(number>0){
            r=number%10;
            number=number/10;
            c=c+1;
        }
        int array[]=new int[c];
        while(temp>0){
            rem=temp%10;
            if(rem%2==0){
                even=even+rem;
            }
            temp=temp/10;
            array[i]=rem;
            i++;
        }
        Arrays.sort(array);
        for(int j=0;j<c;j++){
            sorted=sorted*10+array[j];
        }
        if(even>15){
            return "True";
        }
        else{
            return "False";
        }
    }
}
