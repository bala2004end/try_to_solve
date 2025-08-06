/*Write a c program to accept the array from the user and print the array from left to right

Input Format

Number of elements followed by array as input elements

Constraints

NIL

Output Format

Print the array elements

Sample Input 0

10
1 2 3 4 5 6 7 8 9 10
Sample Output 0

1 2 3 4 5 6 7 8 9 10 
*/
//------------------------------------------------------
import java.util.*;

public class declare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
        int []a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();}
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            
        }
    }
}