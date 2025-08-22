package program;
import java.util.Scanner;

class StringTooLongException extends Exception {
    public StringTooLongException(String message) {
        super(message);
    }
}


public class StringExp {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        try {
	            checkStringLength(input);
	            System.out.println("Valid input: " + input);
	        } catch (StringTooLongException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    // Method to check string length
	    public static void checkStringLength(String str) throws StringTooLongException {
	        if (str.length() > 10) {
	            throw new StringTooLongException("String too large");
	        }
	    }

}



OUTPUT 

Enter a string: HELLO WORLD 124
Error: String too large
