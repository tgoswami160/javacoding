
public class halfpyramidpattern {
    public static void main(String args[]){
        int n=4;
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j<=4; j++) {
        //         if(i>=j)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.print("\n");
        // }
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j<=i; j++) {
        //          System.out.print("*");
            
        //         }
        //         System.out.print("\n");
           
        // }
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j<=4; j++) {
        //         if(i<=j)
        //     System.out.print("*");
        //     else
        //     System.out.print(" ");
        //     }
        //     System.out.print("\n");
        // }
        for (int i = n; i <= 1; i--) {
            for (int j = n; j<=1; j--) {
                if(i<=j)
                 System.out.print("*");
            else
            System.out.print(" ");
            }
            System.out.print("\n");
            
        }
           
        }
       
    }

    

