
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class Nprime {
    static boolean isprime(int n){
        int i=0;
    if(n<=1){
    return false;
    }
    for(i=2;i<n;i++){
    if(n%i==0)
    return false;
    }
    return true;
    }
  public static void main(String[] args) {
        int n,i=0;
        System.out.println("Enter value for n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
       for(i=1;i<=n;i++){
           if (isprime(i)){
               System.out.println(i);
           }
       }
    }
    
}





output 

Enter value for n:
10
2
3
5
7
