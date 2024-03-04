package strings;


// Given a string
// Return true if the string is a valid phone number
// Return false if the string is not a valid phone number

import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean outputOne = regexValidator(input);
        System.out.println(outputOne);
    }

    public static boolean regexValidator(String input){
        String cleanInput = input.replaceAll("[a-zA-Z ]", "");
        if (cleanInput.length()>9){
            if(cleanInput.length()== 10){
                return true;
            }
            else if (cleanInput.length() ==12){
                if (cleanInput.charAt(0)=='+' && cleanInput.charAt(1)=='1'){
                    return true;
                }
            }
        }
        return false;
    }
}
