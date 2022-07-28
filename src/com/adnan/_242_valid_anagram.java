package com.adnan;

public class _242_valid_anagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rac";

        System.out.println(anagram(s,t));

    }

    static boolean anagram (String s , String t){
        if(s.length()!= t.length()){
            return false;
        }

        int[] char_counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
//            here we are subtracting the ascii value of a with the characters index at each iteration and incrementing
            char_counts[s.charAt(i)-'a']++;
            //here we are subtracting the ascii value of a with the characters index at each iteration and decrementing
            char_counts[t.charAt(i)-'a']--;
            System.out.println(s.charAt(i)-'a');
        }

        for (int count:char_counts) {
            if(count !=0){
                return false;
            }
            
        }
        return true;
    }
}
