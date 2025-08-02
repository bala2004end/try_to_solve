/*Count the number of digits in a given number

Sample Input 0

12345
Sample Output 0

5
*/

//---------------------------------------𝐀𝐧𝐬𝐰𝐞𝐫-----------------------------------------------------
import java.util.*;

public class count {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
       
    }
}
