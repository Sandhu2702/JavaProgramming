public class CreatingMethod {
    public void printMessage(){
        System.out.println("Hello, Geeks!");
    }
    public static void main(String[] args){
        CreatingMethod obj=new CreatingMethod();
        //calling the method
        obj.printMessage();
    }
}
