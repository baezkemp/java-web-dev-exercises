package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        HashMap<Character,Integer> myString = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase to count: ");
        String testString = input.nextLine();

        char[] charactersInString = testString.toCharArray();

        for (char letter : charactersInString) {
            if (myString.containsKey(letter)) {
                myString.put(letter, myString.get(letter) + 1);
            } else {
                myString.put(letter, 1);
            }
        }
        for(Map.Entry<Character, Integer> oneChar: myString.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());

        }
    }
}
