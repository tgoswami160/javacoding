import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number whose table u want to print : ");
        int n=sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
        sc.close();
    }
}
