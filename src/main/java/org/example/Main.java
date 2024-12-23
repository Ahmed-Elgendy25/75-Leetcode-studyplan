package org.example;

public class Main {

    public String mergeAlternately(String word1, String word2) {

        int i = 0;

        StringBuilder result = new StringBuilder();
        while(word1.length()>i && word2.length()>i) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;

        }
        if(i>=word1.length()) {
            result.append(word2.substring(i));
        }
        if(i>=word2.length()) {
            result.append(word1.substring(i));
        }

        return result.toString();



    }

    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";
        Main m = new Main();
        System.out.println(m.mergeAlternately(word1,word2));
    }
}