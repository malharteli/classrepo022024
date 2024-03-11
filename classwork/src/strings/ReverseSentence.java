package strings;


// Given a String sentence
// Return a string with the words of the given sentence in reverse order
// Example:
// Input: "the sky is blue"
// Output: "blue is sky the"
// Input: "Hello World!"
// Output: "World! Hello"

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] splitArray = inputString.split(" ");
        String answer = reverseOrder(splitArray);
        System.out.println(answer);
    }

    public static String reverseOrder(String[] inputArray){
        String[] temp = new String[inputArray.length];
        for (int i = inputArray.length-1; i >= 0; i--) {
            temp[inputArray.length-1-i] = inputArray[i];
        }

        return String.join(" ", temp);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inputString = sc.nextLine();
//        String s1 = "the sky is blue";
//        String[] splitString = s1.split(" ");
//
//
//
//
//    }
}
