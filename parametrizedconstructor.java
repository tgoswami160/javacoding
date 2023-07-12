public class parametrizedconstructor {
    int i;
    String name;

    parametrizedconstructor(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public static void main(String[] args) {
        parametrizedconstructor obj = new parametrizedconstructor(10, "tanu");
        System.out.println("Id ="+obj.i + " Name =" + obj.name);
    }
}
