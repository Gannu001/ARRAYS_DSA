import java.util.Scanner;

public class SumofTwoArray{
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    
    int n1 = sc.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < a1.length; i++){
        a1[i] = sc.nextInt();
    }
    
    
    int n2 = sc.nextInt();
    int a2 [] = new int [n2];
    for (int i = 0; i < a2.length; i++){
       a2[i] = sc.nextInt();
    }

    int sum[] = new int[n1 > n2 ? n1:n2];

    int c = 0;   //carry 
    int i=a1.length-1;
    int j=a2.length-1;
    int k=sum.length-1;

    while(k>=0){
       int d = c;

       if(i>=0){         //agar i hai toh -->
        d += a1[i];     // i ko add krdo digit me apne ;

       }
       if(j>=0){            //agar j hai toh -->
        d += a2[j];        // i ko add krdo digit me apne 
       
       }

       c = d/10; // carry establish kr rhe 
       d = d%10;  // digit update kr rhe 

       sum[k] = d ;

       i--;
       j--;
       k--;
}

if(c != 0){    // carry bach jaye last me toh usko print karwana hai uske lia : for example 999+1  =1000
    System.out.print(c);
}

for( int val : sum){
    System.out.print(val);
}

}
    
}
 