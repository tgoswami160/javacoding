import java.util.*;
public class mulwithfun {

    public static int calmul(int a,int b){
        int mul=a*b;
        System.err.print("Multiply  : ");
        return mul;
    }
    public static void main(String args[]){
        System.out.print("Enter the value of a and b: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int mul= calmul(a,b);
       System.out.print(mul);
       sc.close();
    }
}

