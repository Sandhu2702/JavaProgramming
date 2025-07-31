public class Arithmetic {
    public static void main(String[] args){
        //Declaring variables
        int a=500;
        int b=200;

        //addition operation
        int sum=a+b;
        System.out.println("The sum is : "+sum);

        //Subtraction operation
        int difference=a-b;
        System.out.println("The difference is: "+difference);

        //Arithmetic operations on strings
        String n1="15";
        String n2="25";

        //Convert string to integers
        int a1=Integer.parseInt(n1);
        int b1=Integer.parseInt(n2);

        System.out.println("a1+b1="+(a1+b1));
        System.out.println("a1-b1="+(a1-b1));
        System.out.println("a1*b1="+(a1*b1));
        System.out.println("b1/a1="+(b1/a1));
        System.out.println("a1%b1="+(a1%b1));

    }
}
