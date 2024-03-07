package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputOne = sc.nextLine();
        String inputTwo = sc.nextLine();
        int[] inputOneArray = Arrays.stream(inputOne.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] inputTwoArray = Arrays.stream(inputTwo.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] mergedArray=new int[inputOneArray.length +inputTwoArray.length];
        int mergedIndex=0;
        for(int i=0;i<inputOneArray.length;i++)
        {
            mergedArray[mergedIndex]=inputOneArray[i];
            mergedIndex++;

        }
        for(int i=0;i<inputTwoArray.length;i++)
        {
            mergedArray[mergedIndex]=inputTwoArray[i];
            mergedIndex++;
        }
        System.out.println(Arrays.toString(mergedArray));
        int[] array={};
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
}
