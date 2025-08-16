import java.util.Scanner;
public class arithmeticOperationsArray {
    public static int[] computeOperations(int x, int y){
        int[] result=new int[5];
        result[0]= x+y;
        result[1]= x-y;
        result[2]= x*y;
        result[3]= x/y;
        result[4]=x%y;
        return result;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a= sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        int[] ans=computeOperations(a,b);
        for(int val:ans){
            System.out.print(val+ " ");
        }
    }
}
