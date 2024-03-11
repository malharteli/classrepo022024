package algorithms;

//Given two sorted arrays
//Return one sorted, merged array
//Example:
//Input: [1,3,5]
//Input: [2,4,6]
//Output: [1,2,3,4,5,6]

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        int[] inputOneArray = Arrays.stream(inputOne.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] inputTwoArray = Arrays.stream(inputTwo.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] resultArrayOne = mergeSortArrayPoint(inputOneArray, inputTwoArray);
        int[] resultArrayTwo = IntStream.concat(Arrays.stream(inputOneArray), Arrays.stream(inputTwoArray)).toArray();
        mergeSortProper(resultArrayTwo);
        System.out.println(Arrays.toString(resultArrayOne));
        System.out.println(Arrays.toString(resultArrayTwo));
    }

    public static int[] mergeSortArrayPoint(int[] inputOne, int[] inputTwo){
        int[] mergedArray = new int[inputOne.length+inputTwo.length];
        int x=0, y=0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (x < inputOne.length && y<inputTwo.length){
                if (inputOne[x]< inputTwo[y]){
                    mergedArray[i] = inputOne[x];
                    x++;
                }else if (inputOne[x] > inputTwo[y]) {
                    mergedArray[i] = inputTwo[y];
                    y++;
                }
            }else if (x < inputOne.length){
                mergedArray[i]= inputOne[x];
                x++;
            }else if (y < inputTwo.length){
                mergedArray[i]= inputTwo[y];
                y++;
            }
        }
        return mergedArray;
    }

    public static void mergeSortProper(int[] input){
        if(input.length < 2){
            return;
        }
        int half = input.length/2;
        int[] left = new int[half];
        int[] right = new int[input.length-half];
        for (int i = 0; i < left.length; i++) {
            left[i] = input[i];
        }
        for (int i = half; i < right.length;i++){
            right[i-half] = input[i];
        }
        mergeSortProper(left);
        mergeSortProper(right);
        merge(input, left, right);

    }

    public static void merge(int[] input, int[] left, int[] right){
        int lLength = left.length;
        int rLength = right.length;
        int x = 0;
        int y= 0;
        int index= 0;
        while (x < lLength && y < rLength){
            if(left[x] <= right[y]){
                input[index] = left[x];
                x++;
            }else{
                input[index] = right[y];
                y++;
            }
            index++;
        }
        while (x< lLength){
            input[index] = left[x];
            x++;
            index++;
        }
        while (y<rLength){
            input[index]= right[y];
            y++;
            index++;
        }
    }
}