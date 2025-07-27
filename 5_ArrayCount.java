
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class ArrayCount {
     public static void main(String[] args) {
       
        int i,n;
        int pos=0;
        int neg=0;
        int even=0;
        int odd=0;
        int zero=0;
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array:");
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++){
        if(arr[i]>0)
            pos++;
        else if(arr[i]<0)
            neg++;
        else if(arr[i]==0)
            zero++;
        if(arr[i]%2==0)
            even++;
        else
            odd++;
        }
        
        System.out.println("Number of Even Numbers "+even);
         System.out.println("Number of Odd Numbers "+odd);
          System.out.println("Number of Positive Numbers "+pos);
           System.out.println("Number of Negative Numbers "+neg);
           System.out.println("Number of Zeros "+zero);

         
    }
}


output 


Enter size:
6
Enter Elements of Array:
1
-2
0
3
-4
0
Number of Even Numbers 4
Number of Odd Numbers 2
Number of Positive Numbers 2
Number of Negative Numbers 2
Number of Zeros 2