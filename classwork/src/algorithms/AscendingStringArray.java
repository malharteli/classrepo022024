package algorithms;

import java.util.Scanner;

public class AscendingStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] inputStringArray = inputString.split(",");
        for(int j=0;j<inputStringArray.length-1;j++)
        {
        	String temp="";
        for(int i=j+1;i<inputStringArray.length;i++)
        {
        	if(inputStringArray[i].length()<inputStringArray[j].length())
        	{
        	temp=inputStringArray[i];
        	inputStringArray[i]=inputStringArray[j];
        	inputStringArray[j]=temp;
        	}
        }
        }
        for(String element:inputStringArray)
        {
        	System.out.println(element);
        }
        

	}

}
