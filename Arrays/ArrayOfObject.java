class Student{
    public int roll_no;
    public String name;

    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}
public class ArrayOfObject {
    public static void main(String[] args){
        //declaring an array of Student
        Student[] arr;

        //allocating memory for 5 objects of type Student
        arr=new Student[5];

        //initializing the elements of specified array
        arr[0]=new Student(1,"Aman");
        arr[1]=new Student(2,"Vaibhav");
        arr[2]=new Student(3,"Shikhar");
        arr[3]=new Student(4,"Dharam");
        arr[4]=new Student(5,"Mohit");

        //accessing the elements of the specified array
        for(int i=0;i<arr.length;i++){
            System.out.println("element at "+i+": { " +arr[i].roll_no +" "+ arr[i].name+ " }");
        }
    }
}
