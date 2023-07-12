import java.util.*;
public class sumofnno {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i=1,sum=0;
        do {
            sum=sum+i;
            i++;
        } while (i<=n);
        System.out.println(sum);
        sc.close();
    }
}
