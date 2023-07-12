class singleinhritance {
    void showa(){
        System.out.println(" this is a class method");
    }
}
class B extends singleinhritance{
    void showb(){
        System.out.println(" this is b class method");
    }
    
    public static void main(String[] args) {
        singleinhritance obj1=new singleinhritance();
        obj1.showa();
        // obj1.showb();  -------error 
        
        B obj2=new B();
        obj2.showa();
        obj2.showb();
    }
}
