package sorting;

import java.util.Scanner;

// Given a string
// Return a string array with the words ordered by the number within them
// example input: "is2 Thi1s T4est 3a"
// example output: "Thi1s is2 3a T4est"
public class StringNumericalSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        String[] ansArray = new String[inputArray.length];
        for (String s : inputArray) {
            String numString = s.replaceAll("[^\\d-]", "");
            int digit = Integer.parseInt(numString);
            ansArray[digit - 1] = s;
        }
        System.out.println(String.join(" ", ansArray));

    }
}
