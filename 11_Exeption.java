
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class MyExclass {
    public static void main(String args[]) throws IOException
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter string : ");
            String str = br.readLine();
            int a = str.length();
            if (a > 10)
                throw new MyException(a);
            else
                System.out.println("length of string is: " + a);
        }
        catch (MyException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

class MyException extends Exception
{
    private int length;

    public MyException(int a)
    {
        length = a;
    }

    public String toString()
    {
        return "String too large. (" + length + ")";
    }

    
}

Output

Enter string : 
Computer
length of string is: 8


Enter string : 
Goodmorning all
Exception caught: String too large. (15)