import java.util.*;

public class printeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nth term : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 2 ==0) {
                System.out.println(i);
                }
        }
        sc.close();
    }
}
