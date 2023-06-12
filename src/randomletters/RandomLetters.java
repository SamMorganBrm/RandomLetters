package randomletters;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomLetters {

    public static void main(String[] args) {

        char arr[] = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateLetter();
        }

        displayCharArray(arr, 5);
        countOccurrence(arr);
    }

    public static char generateLetter() {
        Random randomNum = new Random();
        char letter = (char) (97 + randomNum.nextInt(26));

        return letter;
    }

    public static void displayCharArray(char charray[], int numPerLine) {
        int pointer = 0;
        while (pointer < charray.length) {
            for (int i = 0; i < numPerLine && pointer <= charray.length - 1; i++) {
                System.out.print(charray[pointer++] + " ");
            }
            System.out.println();
        }
    }

    public static void countOccurrence(char charray[]) {
        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < charray.length; i++) {
            if (alphabet.containsKey(charray[i])) {
                alphabet.put(charray[i], alphabet.get(charray[i]) + 1);
            } else {
                alphabet.put(charray[i], 1);
            }
        }
        //Display information
        //Hello world
        System.out.println();
        System.out.println("Letters \t\tCount");
        for (Character character : alphabet.keySet()) {
            System.out.println(character + "\t\t" + alphabet.get(character));
        }
    }
}
