package strings;

import java.util.*;

// given a string of braces
// return true if braces are terminated accurately with the correct end brace
//Example Input: "()"
//Example out: true
//Example Input: "({})"
//Example Output: true
//Example Input: "([()})"
//Example: false
//Example: "([)]"
//Output: false
//Example: "([]{})"
//Output: true
public class BracketChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        boolean returnBool = checkerReplaceAll(inputString);
        boolean returnBool2 = checkerDeque(inputString);
        System.out.println(returnBool);
        System.out.println(returnBool2);
    }

    //([{}])
    //([])
    //()
    //""
    //{[(])}
    //()
    //[]
    //{}
    //{[(])} > 0
    public static boolean checkerReplaceAll(String input){
        String workString = input.replaceAll("^\\(\\)\\[]\\{}]","");
        while(workString.contains("()") || workString.contains("[]")|| workString.contains("{}")){
            workString = workString.replaceAll("\\(\\)","") // ()
                    .replaceAll("\\{}","") //{}
                    .replaceAll("\\[]",""); //[]
        }
        return (workString.length()==0);
    }

    public static  boolean checkerDeque(String input){
        Deque<Character> deque = new LinkedList<>(); //Last in First out
        for (Character ch : input.toCharArray()){
            if (ch =='{'|| ch=='[' || ch == '('){
                deque.addFirst(ch);
            }else {
                if (!deque.isEmpty()){
                    if (deque.peekFirst()=='{' && ch == '}'|| deque.peekFirst()=='[' && ch==']' || deque.peekFirst()=='(' && ch==')'){
                        deque.removeFirst();
                    }
                }
            }
        }
        return deque.size()==0;
    }

    //(hello[world]touche)
    // true
    public static boolean checkerStack(String input){
        Stack<Character> stack = new Stack<>(); //LIFO - > Last in, First out //Stack -> stack.push, stack.pop
        for (Character ch: input.toCharArray()){
            if (ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else if (!stack.isEmpty()){
                if (stack.peek() == '(' && ch ==')' || stack.peek()=='[' && ch ==']' || stack.peek() == '{' && ch == '}'){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }


}
