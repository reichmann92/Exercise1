/**
 * 
 */

/**
 * @author Mohsen
 *
 */
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hello ASE2016 - how are you? Please enter your name:");
		Scanner scanner = new Scanner(System.in);
		String eingabe = scanner.next();
		
		HelloUser user = new HelloUser(eingabe);
		System.out.println("Hello "+user.getUserName()+"!");
		//System.out.println("das isr es: "+eingabe);
		//System.out.println("Hello ASE2016 - how are you? :)");
	}
}
