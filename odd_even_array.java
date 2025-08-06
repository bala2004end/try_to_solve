/*Write a program to accept the array and count the number of odd and even numbers in the given array

Input Format

Number of elements followed by array as an input

Constraints

NIL

Output Format

Display the number of Odd and Even numbers in the given array

Sample Input 0

10
77 67 55 44 25 14 87 95 45 92
Sample Output 0

Odd = 7
Even = 3

----------------------------------------------------------------------*/
import java.util.*;

public class odd_even_array {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int count=0;
        int count1=0;
        int []a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
            
            if(a[i]%2==0){
                count++;
            }
            else
                count1++;
        }
        System.out.println("Odd = "+count1);
        System.out.println("Even = "+count);
    }
}