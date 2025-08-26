package program;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOp {
	public static void main(String[] args) {
		 String sourceFile = "input.txt"; //right click on project name and select textfile
	     String destinationFile = "result.txt";

	     try (FileInputStream fis = new FileInputStream(sourceFile);
	          FileOutputStream fos = new FileOutputStream(destinationFile)) {

	         int ch;
	         while ((ch = fis.read()) != -1) {
	             fos.write(ch);
	         }

	         System.out.println("File copied successfully!");

	     } catch (Exception e) {
	         System.out.println("An error occurred: " + e.getMessage());
	     }
		
	}

}
 



output 

input.txt 

hi hello  

result.txt

hi hello 