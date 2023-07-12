 class isainheritance {
    void eat(){
        System.out.println("I am eating");
    }
}
class child extends isainheritance{
    public static void main(String[] args) {
        child cat= new child();
        cat.eat();
        System.out.println("hello i am main");
       
    }
}