
abstract class Geeks{
    void check(String name){
        System.out.println(name);
    }
}
public class abstractMethod extends Geeks{
    @Override
    void check(String name) {
        System.out.println(name);
    }
    public static void main(String[] args){
        abstractMethod obj=new abstractMethod();// subclass object
        obj.check("Geeks for Geeks");
    }
}