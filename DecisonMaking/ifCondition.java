import java.util.Scanner;

public class ifCondition {
    public static void solve(int n){
        if(n>100){
            System.out.println("Big");
        }
        System.out.println("Number");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        solve(n);
    }
}
