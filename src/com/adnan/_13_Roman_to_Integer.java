package com.adnan;

import java.util.HashMap;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s){

        HashMap<Character,Integer> indexMap = new HashMap<Character,Integer>();
        indexMap.put('I',1);
        indexMap.put('V',5);
        indexMap.put('X',10);
        indexMap.put('L',50);
        indexMap.put('C',100);
        indexMap.put('D',500);
        indexMap.put('M',1000);
        int count = indexMap.get(s.charAt(s.length()-1));

        for (int i = s.length()-2; i >=0 ; i--) {
            if(indexMap.get(s.charAt(i))<indexMap.get(s.charAt(i+1))){
                count -= indexMap.get(s.charAt(i));
            }else{
                count += indexMap.get(s.charAt(i));
            }
        }
        return count;
    }
}
