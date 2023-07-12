import java.util.*;
public class sumwithfun {
    public static int calsum(int a,int b){
        int sum=a+b;
        System.out.print("sum : ");
        return sum;
    }
    public static void main(String args[]){
        System.out.print("Enter the value of a and b: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        int b=sc.nextInt();
       int sum= calsum(a,b);
       System.out.print(sum);
       sc.close();
    }
}
