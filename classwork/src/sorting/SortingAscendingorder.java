package sorting;

import java.util.Scanner;

public class SortingAscendingorder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] Stingarray=s.split(",");
        for(int j=0;j< Stingarray.length-1;j++){
            for(int i=j+1;i<Stingarray.length;i++){
                String temp;
                if(Stingarray[i].length()<Stingarray[j].length()){
                    temp=Stingarray[i];
                    Stingarray[i]= Stingarray[j] ;
                    Stingarray[j]=temp;
                }
            }
        }

        for(String elements:Stingarray)
            System.out.println("elements :" +elements);
    }
}
