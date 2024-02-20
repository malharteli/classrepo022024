package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] inputStringArray = inputString.split(", ");
        int[] inputIntArray = Arrays.stream(inputStringArray).mapToInt(Integer::parseInt).toArray();
//
//        for (int i : inputIntArray) {
//            System.out.println(i);
//        }
        System.out.println(majorityElementMap(inputIntArray));
        System.out.println(majorityElementSort(inputIntArray));
        System.out.println(majorityElementVote(inputIntArray));
    }
    public static int majorityElementMap(int[] input){
        Map<Integer, Integer> map = new HashMap<>();
        int half = input.length/2;

        for (int num : input){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ans = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue()>=half){
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }

    public static int nehaSolution(int[] input){
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String[] strArr=n.split(",");
        Arrays.stream(input).forEach(i->{
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        });

        for ( Integer key : map.keySet() ) {
            if(map.get(key)>strArr.length/2){
                return key;
            }
        }
        return 0;
    }

    public static int majorityElementSort(int[] input){
        int half = input.length/2;
        Arrays.sort(input);
        return input[half];
    }

    public static int majorityElementVote(int[] input){
        int count = 0;
        int element = 0;

        for (int num: input){
            if (count==0) {
                element = num;
                count = 1;
            }else if (element==num){
                count++;
            }else{
                count--;
            }
        }

        return element;
    }
}
