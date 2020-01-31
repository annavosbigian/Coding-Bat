/*
https://techdevguide.withgoogle.com/paths/foundational/subnumbers-problem-string-return-sum/#!
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

import java.util.ArrayList;

public class sumNumbers {
    public int sumNumbers(String str){
        int sum = 0;
        //store ints
        ArrayList<Integer> ints = new ArrayList<Integer>();
        //go thru str
        for (int i = 0; i < str.length();){
            int segment = i;
            while (Character.isDigit(str.charAt(i))){
                i++;
                if (i==str.length() || !Character.isDigit(str.charAt(i))){
                    ints.add(Integer.parseInt(str.substring(segment, i)));
                    i--;
                    break;
                }
            }
            i++;
        }
        for (Integer x : ints){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        String int1 = "abc123xyz";
        String int2 = "aa11b33";
        String int3 = "7 11";
        sumNumbers sn = new sumNumbers();
        System.out.println(sn.sumNumbers(int1));
        System.out.println(sn.sumNumbers(int2));
        System.out.println(sn.sumNumbers(int3));
    }
}
