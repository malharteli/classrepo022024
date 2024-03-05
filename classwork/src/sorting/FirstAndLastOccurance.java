package sorting;

// Given a Sorted list of Numbers and a specific integer
// Find the first and last occurance of the integer in the List of Numbers
// Given:
// Input 1: 1,1,2,2,2,3,3,4,7,8,8,8
// Input 2: 8
// Answer: 9, 11
// Input 1: 0,0,1,1,1,2,2
// Input 2: 3
// Answer: -1, -1
// Input 1: 0,0,1,2,2
// Input 2: 1
// Answer: 2,2

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStrArray = sc.nextLine().split(",");
        int[] inputIntArray = Arrays.stream(inputStrArray).mapToInt(Integer::parseInt).toArray();
        int inputInt = sc.nextInt();
        int[] ansArr = occuranceGatherPointer(inputIntArray, inputInt);
        Arrays.stream(ansArr).forEach(System.out::println);
    }

    public static int[] occuranceGatherPointer(int[] array, int input){
        int[] answer = new int[2];
        answer[0] = array.length;
        answer[1] = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input){
                if (answer[0]>i) {
                    answer[0] = i;
                }
                if (answer[1] < i){
                    answer[1] =i;
                }
            }
        }
        return answer;
    }
}
