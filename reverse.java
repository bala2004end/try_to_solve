/*Write a program to accept the elements into an array and display the array from right to left

Input Format

Number of elements followed by array as an input

Constraints

NIL

Output Format

Print the array elements after modification

Sample Input 0

10
1 2 3 4 5 6 7 8 9 10
Sample Output 0

10 9 8 7 6 5 4 3 2 1 

------------------------------*/

import java.util.*;

public class reverse {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        for(int i=size-1;i>=0;i--)
        System.out.print(a[i]+" ");
        }
}