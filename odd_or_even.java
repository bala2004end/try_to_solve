/*Write a java program to check the number is odd or even using conditional construct

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

ODD/EVEN

Sample Input 0

3
Sample Output 0

ODD
Sample Input 1

8
Sample Output 1

EVEN

-----------------------------Answer----------------------------
*/
import java.util.*;

public class odd_or_even {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
        
    }
}
