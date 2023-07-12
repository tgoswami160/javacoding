public class noarguconstructor {
    int i;
    String name;
    noarguconstructor(){
        System.out.println("this is no argument constructor");
    }
    public static void main(String[] args) {
        new noarguconstructor();
    }
}
