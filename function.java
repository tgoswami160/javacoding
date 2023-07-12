import java.util.*;

public class function {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        System.out.print("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("My name is : ");
        printMyName(name);
        sc.close();
    }
}
