public class VarargsDifferentDataTypes {
    static void fun(float x, String s, int... a){
        System.out.println("Number of arguments: "+(2+a.length));
        //display contents of arguments
        System.out.print(x + " ");
        System.out.print(s + " ");
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        fun(2.4f,"india",100);
        fun(1f,"hello",2,78,90,4,8);
        fun(2.1f,"you");
    }
}
