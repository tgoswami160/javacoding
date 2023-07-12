import java.util.Scanner;

/**
 * primeno
 */
public class primeno {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int choice=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                choice++;
            }
        }ye nhi hua tha mujhse
        if(choice<=2){
            System.out.println("it is a  prime number");
        }
        else
        System.out.println("not prime number");
        sc.close();
    }
}
