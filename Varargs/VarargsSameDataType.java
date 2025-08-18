public class VarargsSameDataType {
    static void fun(int... a){
        System.out.println("Number of arguments: "+a.length);
        //display contents of arguments
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        fun(100);
        fun(1,2,78,90,4,8);
        fun();
    }
}
