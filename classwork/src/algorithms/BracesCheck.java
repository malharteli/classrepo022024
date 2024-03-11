package algorithms;

import java.util.Scanner;

public class BracesCheck {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        int roundCt = 0, squreCt = 0, curlyCt = 0, roundCtClose = 0, squreCtClose = 0, curlyCtClose = 0;

        for(int i=0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == '(') {
                roundCt++;
            }else if(inputString.charAt(i) == ')') {
                roundCtClose++;
            }else if(inputString.charAt(i) == '{') {
                curlyCt++;
            }else if(inputString.charAt(i) == '}') {
                curlyCtClose++;
            }else if(inputString.charAt(i) == '[') {
                squreCt++;
            }else if(inputString.charAt(i) == ']') {
                squreCtClose++;
            }
        }

        if((roundCt != roundCtClose) || (squreCt != squreCtClose) || (curlyCt != curlyCtClose)) {
            System.out.println( "Not A Good Braces Sequence.");
        }else {
            System.out.println("All Good Braces.");
        }

    }
}
