package strings;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// given a string of braces
// return true if braces are terminated accurately with the correct end brace
public class BracketChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        boolean returnBool = checkerReplaceAll(inputString);
        boolean returnBool2 = checkerDeque(inputString);
        System.out.println(returnBool);
        System.out.println(returnBool2);
    }

    public static boolean checkerReplaceAll(String input){
        String workString = input;
        while(workString.contains("()") || workString.contains("[]")|| workString.contains("{}")){
            workString = workString.replaceAll("\\(\\)","")
                    .replaceAll("\\{}","")
                    .replaceAll("\\[]","");
        }
        return (workString.length()==0);
    }

    public static  boolean checkerDeque(String input){
        Deque<Character> deque = new LinkedList<>();
        for (Character ch : input.toCharArray()){
            if (ch =='{'|| ch=='[' || ch == '('){
                deque.addFirst(ch);
            }else {
                if (!deque.isEmpty()){
                    if (deque.peekFirst()=='{' && ch == '}'|| deque.peekFirst()=='[' && ch==']' || deque.peekFirst()=='(' && ch==')'){
                        deque.removeFirst();
                    }
                    else return false;
                }
            }
        }
        return deque.size()==0;
    }


}
