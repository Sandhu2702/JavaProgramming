public class Static {
    public static void greet(){
        System.out.println("Hello, world!");
    }
    public static void main(String[] args){
        greet();
        Static.greet();
    }
}
