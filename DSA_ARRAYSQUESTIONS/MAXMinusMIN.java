import java.util.*;
public class MAXMinusMIN{
    public static void  maxMmin( int arr[]){
           //arranging in asscending order: 
         
           int max =arr[0];
           int min =arr[0];
           for(int  i= 0 ; i<arr.length ;i++)
           {
           
            if( arr[i] >  max){
                max=arr[i];
            }
           
            if(arr[i]<min){
                min=arr[i];
            }
          }
           
          int spam  = max-min;
          System.out.println( "max - min is equal to:" +spam);
          
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number here : ");
        int  n = sc.nextInt();
        int [] arr = new int[n];
      
        for(int i = 0 ; i<arr.length;i++){
        arr[i] = sc.nextInt();
        }

        maxMmin(arr);
   }
    
}
