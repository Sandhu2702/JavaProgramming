public class callStack {
    public static void D(){
        System.out.println("In method D");
    }
    public static void C(){
        System.out.println("In method C");
    }
    public static void B(){
        C();
        System.out.println("In method B");
    }
    public static void A(){
        B();
        System.out.println("In method A");
    }
    public static void main(String[] args){
        A();
        D();
        System.out.println("This is an example of call stack.");
    }

}
