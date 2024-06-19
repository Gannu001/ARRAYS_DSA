import java.util.Scanner;

public class arraysBasics{
     public static void main(String[] args) {
        
        int [] arr ;
        arr = new int[10];   // isme kuki ye non primitive data types hai isla  heap me memory store ho jata hai or vairable uska stack memoey me with its adress  
        
         arr[1] = 10 ;
         arr[2] = 20 ;
         arr[3] = 30 ;
         arr[4] = 40 ;
         arr[5] = 50 ;
         arr[6] = 60 ; 

         int one[] = arr;
         one[5] =400;
            



        for(int i = 0 ; i < arr.length ; i++){
        System.out.println(one [i]);
        }
    
    }

}