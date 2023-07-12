 class multilevel {
    void showa() {
        System.out.println("a class method");
    }
}

class bclass extends multilevel {
    void showb() {
        System.out.println("b class method");
    }
}

class cclass extends bclass {
    void showc() {
        System.out.println("c class method");
    }

    
    public static void main(String[] args) {
        multilevel obj1 = new multilevel();
        obj1.showa();
        // obj1.showb(); ---------error
        // obj1.showc(); ---------error
        bclass obj2 = new bclass();
        obj2.showa();
        obj2.showb();
        // obj2.showc(); ----------error
        cclass obj3 = new cclass();
        obj3.showa();
        obj3.showb();
        obj3.showc();
    }

}
