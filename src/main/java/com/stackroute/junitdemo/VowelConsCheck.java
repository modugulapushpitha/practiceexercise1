package com.stackroute.junitdemo;

public class VowelConsCheck {
    public  String inputCheck(String input)
    {
        String output="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if( (ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z'))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||
                        ch=='I'||ch=='O'||ch=='U')
                {
                    output+= "Vowel";
                }
                else
                {
                    output+= "Consonant";
                }

            }
            else
            {
                output+="not an alphabet";
            }

        }
        return output;
    }
}

