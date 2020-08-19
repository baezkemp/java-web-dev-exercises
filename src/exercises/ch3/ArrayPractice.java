package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
//        3.7.1.1 - Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] arrayPractice = {1, 1, 2, 3, 5, 8};
//        3.7.1.2 - Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for (int i : arrayPractice) {
            System.out.println(i);
        }
//        3.7.1.3 - For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax, look back at the String methods table.
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayString = greenEggs.split(" ");
//        3.7.1.4 - Print the array of words to verify that your code works. The syntax is:
        System.out.println(Arrays.toString(arrayString));
//        3.7.1.5 - Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        String[] arrayString2 = greenEggs.split("\\.");
        System.out.println(Arrays.toString(arrayString2));

        String[] arrayString3 = greenEggs.split("not");
        System.out.println(Arrays.toString(arrayString3));
    }
}
