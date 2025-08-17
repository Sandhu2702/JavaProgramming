class Test{
    static void hello(){
        System.out.println("Hello");
    }
}
public class StaticMethod {
    public static void main(String[] args){
        Test.hello();//call static method directly
    }
}
