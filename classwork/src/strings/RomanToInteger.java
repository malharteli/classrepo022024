package strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Given a String of Roman Numerals
// Return the integer value of the Roman Numerals
// Input: VI
// Output: 6
// Input: IV
// Output: 4
// Input: XXVII
// Output: 27
// Input: MCMXCIX
// M - 1000
// CM - 900
// XC - 90
// IX - 9
// Output: 1999
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = romanMap(input);
        int result2 = romanRecur(0, input);
        System.out.println(result);
        System.out.println(result2);
    }

    static int romanMap(String input){
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i< input.length()-1 && m.get(input.charAt(i))< m.get(input.charAt(i+1))){
                result-= m.get(input.charAt(i));
            }else{
                result+= m.get(input.charAt(i));
            }
        }
        return result;
    }

    static int romanRecur(int result, String input){
        if (input.length()==1){
            return result + value(input.charAt(0));
        }
        else{
            int valueA = value(input.charAt(input.length()-1));
            int valueB = value(input.charAt(input.length()-2));
            if( valueA> valueB){
                return input.length()>2? romanRecur(result + valueA-valueB, input.substring(0,input.length()-2)): result + valueA-valueB;
            }else{
                return romanRecur(result + valueA, input.substring(0, input.length()-1));
            }
        }
    }

    static int value(Character c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
