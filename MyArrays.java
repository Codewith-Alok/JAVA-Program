package arrays;

public class MyArrays {
 
    public static void main(String[] args) {
        int rollNo[] = new int[5];
        // int age[];
        // age = new int[10]; // <-- semicolon added here 
         
        int dummy [] = {2,3,4,5,5,6,77,7}; 
        rollNo[0] = 63 ; 
        System.out.println(rollNo);

        for(int i = 0 ; i<rollNo.length ; i++){
            System.out.println(rollNo[i]);
        }
    }

    public static void insert(int arr[] , int pos , int element ) {
        int size = arr.length;
        if (pos<0 || pos>size-1) {
        System.out.println("wrong position ");
        return ;             
        }
        for(int i =size-2 ; i>=pos ; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }
}
