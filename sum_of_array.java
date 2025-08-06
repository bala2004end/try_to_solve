/*
Write a program to accept the elements into an array and display the sum of the array.

Input Format

Number of elements followed by array as input elements

Constraints

NIL

Output Format

Print the sum of the array elements

Sample Input 0

10
1 2 3 4 5 6 7 8 9 10
Sample Output 0

55 
--------------------------Answer-----------------------*/
import java.util.*;

public class sum_of_array  {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int i;
        int size=s.nextInt();
        int a[]=new int[size];
        for( i=0;i<size;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum of the array:"+sum);
    }
}