package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class OddOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] inputStringArray = inputString.split(",");
        int[] inputIntArray = Arrays.stream(inputStringArray).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(inputIntArray);
        int count=1;
        int temp=inputIntArray[0];
        for(int i=1;i<inputIntArray.length;i++){
            if(inputIntArray[i]==temp){
                count++;
            }else{
                if(count%2==0){
                    temp=inputIntArray[i];
                    count=1;
                }

            }

        }
        System.out.println(temp);
    }
}
