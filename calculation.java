import java.util.*;

public class calculation {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation u want to be peformed : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            System.out.println(a+b);
                 break;
            case '-':
            System.out.println(a-b);
                 break;
            case '*':
            System.out.println(a*b);
                 break;
            case '/':
            System.out.println(a/b);
                 break;
            case '%':
            System.out.println(a%b);
                 break;
        
            default:System.out.println("invalid operator ....");
                break;
        }
        sc.close();
    }
}
