import java.util.*;
public class finddata {

    public static void find(int arr[],int data){
        int indx = -1;
        for(int i = 0 ; i<arr.length ;i++){
            
            if(arr[i]== data){
               indx = i;
               break;
            }
           
        }
        System.out.println( " element position is in index number --> " + indx);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the number of arrays you want  :");
         int n = sc.nextInt();
         System.out.println("enter the arrays below:" );
         int arr[] = new int[n] ;
         
         for(int i = 0 ; i<arr.length ;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("print the number to be find here:");
        int data = sc.nextInt();
         find(arr,data);
        
    }

}