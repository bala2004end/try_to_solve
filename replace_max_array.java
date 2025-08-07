/*Sample Input 0

10
10 20 30 40 50 60 70 80 90 100
Sample Output 0

540 530 520 510 500 490 480 470 460 450

---------------------------------------------------*/
import java.util.*;

public class replace_max_array {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int sum=0;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();//get the elem from user
                sum+=a[i];
            }
        for(int i=0;i<size;i++){
            //int sub=sum-a[i];
        System.out.print(sum-a[i]+" ");
        }
    }
}