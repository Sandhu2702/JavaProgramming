public class callingUserDefinedMethod {
    void hello(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args){
        callingUserDefinedMethod obj=new callingUserDefinedMethod();
        obj.hello();
    }
}
