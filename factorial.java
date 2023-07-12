import java.util.*;
public class factorial {
    public static void fact(int n){
if (n<0) {
    System.out.println("invalid number");
    return;
    
}
int factorial=1;
for(int i=n;i>=1;i--){
    factorial=factorial*i;
}
System.out.println(factorial);
return;
    }
    public static void main(String args[]){
        System.out.print("Enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("factorial of n numbers is: ");
        fact(n);
        sc.close();
    }
}
