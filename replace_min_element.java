/*Write a program to accept the elements into an array and replace every element in the array with the sum of its right side elements

Input Format

Number of elements followed by array as an input

Constraints

NIL

Output Format

Display the array elements after modification

Sample Input 0

10
10 20 30 40 50 60 70 80 90 100
Sample Output 0

540 520 490 450 400 340 270 190 100 0
-----------------------------Answer---------------------
*/
import java.util.*;

public class replace_min_element {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        
        int size=s.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];
                   
        }  System.out.println("reverse less value");
        for(int i=0;i<size;i++){
        sum=sum-a[i];
      
            System.out.print(sum+" ");
        }
  
    }
}
