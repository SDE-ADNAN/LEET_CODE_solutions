package com.adnan;

import java.util.HashSet;

public class _804_Unique_Morse_Code_Words {
    public static void main(String[] args) {
       String[] words = {"gin","zen","gig","msg"};
        System.out.println(getSetNum(words));
    }
    static int getSetNum(String[] s){

        String[] MORSE ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String> uniqueSet = new HashSet<>();
        for (String word: s) {
            StringBuilder transformation = new StringBuilder();
            for (char letter: word.toCharArray()) {
                transformation.append(MORSE[letter-'a']);
            }
            uniqueSet.add(transformation.toString());
        }
        return uniqueSet.size();
    }
}
