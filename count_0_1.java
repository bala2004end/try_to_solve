/*Sample Input 0

10
0 0 0 0 0 1 1 1 1 1
Sample Output 0

zc = 5
oc = 5

--------------------------*/
import java.util.*;
public class count_0_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int count=0;
        int c1=0;
        int i;
        
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=s.nextInt();}
        for(i=0;i<size;i++){
            if(a[i]==0)
                count++;
            else
                c1++;
        }
        System.out.println("zc = "+count+"\noc = "+c1);
    }
}