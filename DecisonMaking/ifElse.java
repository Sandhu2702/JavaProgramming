import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(n>100) {
            System.out.println("Big");
        }else{
            System.out.println("Smaller");
        }
    }
}
