
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class Perfect {
    public static void main(String[] args) {
        
        int n,sum=0,i;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++){
        if(n%i==0){
        sum=sum+i;
        }
        }
        if(sum==n){
        System.out.println(n+" is a Perfect Number");
        }
        else if(sum>n){
        System.out.println(n+" is a abundant Number");
        }
        else{
         System.out.println(n+" is a deficient Number");
        }
    }
    
}



output 
Enter a number:
6
6 is a Perfect Number


Enter a number:
12
12 is a abundant Number

Enter a number:
9
9 is a deficient Number