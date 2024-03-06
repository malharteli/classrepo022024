import java.util.Scanner;

/*// Given a Sorted list of Numbers and a specific integer
// Find the first and last occurance of the integer in the List of Numbers
// Given:
// Input 1: 1,1,2,2,2,3,3,4,7,8,8,8
// Input 2: 8
// Answer: 9, 11
// Input 1: 0,0,1,1,1,2,2
// Input 2: 3
// Answer: -1, -1
// Input 1: 0,0,1,2,2
// Input 2: 1
 Answer: 2,2*/
public class LastOccurance {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(",");
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=Integer.parseInt(a[i]);

        }
        int x = sc.nextInt();

        for(int j=0;j<b.length;j++) {
            if (x == b[j]) {
                System.out.println("first occurence:" + j);
                break;

            }
        }

           for(int k=b.length-1;k>-1;k--) {
               if(x==b[k]){
                   System.out.println("lastOccurence:"+k);
                  break;
               }
           }


        }

    }


