 class hierarchical {
    void showa(){
        System.out.println("a ka method h ye ");
    }
}
 class bclas extends hierarchical{
    void showb(){
        System.out.println("b ka method h ye ");
    }
}
 class cclas extends hierarchical{
    void showc(){
        System.out.println("c ka method h ye ");
    }
    public static void main(String[] args) {
        hierarchical obj01=new hierarchical();
        obj01.showa();
        // obj01.showb();
        // obj01.showc();   -----error
        bclas obj02=new bclas();
        obj02.showa();
        obj02.showb();
        // obj02.showc();  ----error
        cclas obj03=new cclas();
        obj03.showa();
        // obj03.showb();  ---error
        obj03.showc();

    }
}
