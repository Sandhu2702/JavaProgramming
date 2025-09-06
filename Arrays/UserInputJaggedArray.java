import java.util.Scanner;

public class UserInputJaggedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of sub-arrays:");
        int numOfSubArrays=sc.nextInt();

        //Declare the jagged array
        int[][] jagged_Array=new int[numOfSubArrays][];

        //Allocate memory to each sub-array
        for(int i=0;i<numOfSubArrays;i++){
            System.out.print("Enter the size of sub-array"+(i+1)+":");
            int sizeOfSubArray=sc.nextInt();
            jagged_Array[i]=new int[sizeOfSubArray];
        }
        //initialized the elements of each sub-array
        for(int i=0;i<numOfSubArrays;i++){
            System.out.println("Enter the elements of subArray"+(i+1)+":");
            for(int j=0;j<jagged_Array[i].length;j++){
                jagged_Array[i][j]=sc.nextInt();
            }
        }
        //print the elements of the jagged array
        System.out.println("The jagged array is: ");
        for(int i=0;i<numOfSubArrays;i++){
            for(int j=0;j<jagged_Array[i].length;j++){
                System.out.print(jagged_Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
