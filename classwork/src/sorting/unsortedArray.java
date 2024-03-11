package sorting;
//Given an unsorted list of integers
// return the second largest integer from the array
import java.util.Arrays;
import java.util.Scanner;

public class unsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] inputArray = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
//        for (int j = 0; j < inputArray.length; j++) {
//            for (int i = j + 1; i < inputArray.length; i++) {
//                if (inputArray[i] < inputArray[j]) {
//                    int temp = inputArray[i];
//                    inputArray[i] = inputArray[j];
//                    inputArray[j] = temp;
//
//                }
//            }
//
//        }
        int index1=0, index2=0;
        for(int i=0;i<inputArray.length-1;i++){
            int temp = inputArray[i];

            if(inputArray[i]>inputArray[index1]){
                index2=index1;
                index1=i;

            }else if(inputArray[i]>inputArray[index2]){
                index2=i;
            }
            //System.out.println();


        }
        System.out.println(inputArray[index2]);
    }
}