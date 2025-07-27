
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class Nfibonacci {
    public static void main(String[] args) {
       
        int f1=0,f2=1,f3,n,i;
        System.out.println("Enter the Value for n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(f1);
        System.out.println(f2);
        for(i=0;i<n-2;i++)
        {
        f3=f1+f2;
        System.out.println(f3);
        f1=f2;
        f2=f3;
        }
    }
    
}


output

Enter the Value for n:
7
0
1
1
2
3
5
8