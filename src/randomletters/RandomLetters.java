package randomletters;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomLetters {

    public static void main(String[] args) {
        generateLetter();
        char arr[] = {'a', 'b', 'b', 'c', 'c', 'c', 'd', 'd', 'd', 'd', 'e', 'e', 'a'};
        displayCharArray(arr, 5);
        countOccurrence(arr);
    }

    public static char generateLetter() {
        Random randomNum = new Random();
        char letter = (char) (97 + randomNum.nextInt(26));
        System.out.println(letter);
        return letter;
    }

    public static void displayCharArray(char charray[], int numPerLine) {
        int cont = 0;

        for (int i = 0; i < charray.length; i++) {
            if (cont < numPerLine) {
                System.out.print(charray[i] + " ");
                cont++;
            } else if (i < charray.length && cont == numPerLine) {
                System.out.println("");
                cont = 0;
                i--;
            }
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
        System.out.println();
        System.out.println("Letters \t\tCount");
        for (Character character : alphabet.keySet()) {
            System.out.println(character + "\t\t" + alphabet.get(character));
        }
    }
}
