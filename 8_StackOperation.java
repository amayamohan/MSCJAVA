
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class StackOperation {
    int top=-1;
	int maxsize=5;
	int[] stack=new int[5];
	
	void push(int value) {
		if(top==maxsize-1) {
			System.out.println("\nStack Overflow");
			
		}
		else {
			stack[++top]=value;
		    System.out.println(value+"Inserted");
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("\nStack underflow");

		}
		else {
			int value=stack[top--];
		    System.out.println(value+"deleted");
		}
		
	}
	
	  void peek() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.println("Top element is: " + stack[top]);
	        }
	    }
      boolean isEmpty() {
    	  return top==-1;
      }
      
      void display() {
    	  if (top==-1) {
    		  System.out.println("Stack Empty");
    		  
    	  }
    	  else {
    		  System.out.println("Stack Elements");
    		  for(int i=0;i<=top;i++) {
    			  System.out.print(stack[i]+" ");
    			  
    		  }
    		  System.out.println();
    	  }
    	  
      }
      
      
      
      public static void main(String[] args) {
    	  
          StackOperation s = new StackOperation();
    	  Scanner sc=new Scanner(System.in);
    	  int choice,value;
    	  System.out.println("STACK OPERATIONS\t1.PUSh\t2.POP\t3.PEEK\t4.DISPLAY\t5.EXIT");
    	  do {
    		  System.out.println("Enter your choice:");
    		  choice=sc.nextInt();
    		  switch(choice) {
    		  case 1:System.out.println("Enter value to push:");
    		         value=sc.nextInt();
    		         s.push(value);
    		         break;
    		  case 2:s.pop();
    		         break;
    		  case 3:s.peek();
    		        break;
    		  case 4:s.display();
    		        break;
    		  case 5:System.out.println("Exiting...");
    		  }
    		  
    	  }while(choice!=5);
		
	}
    
}


output

STACK OPERATIONS	1.PUSh	2.POP	3.PEEK	4.DISPLAY	5.EXIT
Enter your choice:
1
Enter value to push:
22
22Inserted
Enter your choice:
1
Enter value to push:
34
34Inserted
Enter your choice:
1
Enter value to push:
56
56Inserted
Enter your choice:
1
Enter value to push:
67
67Inserted
Enter your choice:
4
Stack Elements
22 34 56 67 
Enter your choice:
2
67deleted
Enter your choice:
4
Stack Elements
22 34 56 
Enter your choice:
2
56deleted
Enter your choice:
4
Stack Elements
22 34 
Enter your choice:
3
Top element is: 34
Enter your choice:
5
Exiting...