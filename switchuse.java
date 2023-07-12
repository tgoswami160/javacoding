import java.util.*;
public class switchuse {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("choices are: ");
        System.out.println("1 ");
        System.out.println("2 ");
        System.out.println("3 ");
        System.out.print("enter the choice : ");
        int a=sc.nextInt();
        switch (a) {
            case 1:
            System.out.println("hello.... ");
                break;
            case 2:
            System.out.println("Namate....");
            break;
            case 3:
            System.out.println("Bonjour.....");
            break;
            default:
            System.out.println("you entered wrong choice..... ");
                break;
        }
        sc.close();
    }
}
