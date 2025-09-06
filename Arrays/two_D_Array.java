import java.util.Scanner;

public class two_D_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Taking number of rows and columns from user input
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
