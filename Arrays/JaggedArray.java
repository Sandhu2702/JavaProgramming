public class JaggedArray {
    public static void main(String[] args){
        //declaring a 2D array with 2 rows
        int[][] arr=new int[2][];

        //making the above array jagged
        arr[0]=new int[3];
        arr[1]=new int[2];

        //initializing array
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }

        //printing the array elements
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
