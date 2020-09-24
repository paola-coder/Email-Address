import java.util.Scanner;
public class EmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner numb = new Scanner (System.in);
		
		Scanner keyboard = new Scanner(System.in); //creates a scanner capable of user input
		System.out.println("What is your first name?");
		String firstName = keyboard.nextLine();
		
		
		System.out.println("Please type your birthday! (mm-dd-yyyy)");
		String birthday = keyboard.nextLine();

		
//		String b = birthday.substring(0,1).substring(3,4).substring(6,9);
		

		
		System.out.println("What is your middle name?");
		String middle = keyboard.nextLine();
		
		System.out.println("What is your last name?");
		String last = keyboard.nextLine();
				
		System.out.println("Email: " + last.substring(0).toLowerCase() + firstName.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase() + "@sharkmail.com" );
		
				
		System.out.println("Temporary Password : " + birthday.substring(0,2)+ birthday.substring(3,5)+ birthday.substring(6));
//		int b = keyboard.nextInt();
		System.out.println("*Password is weak, please change as soon as possible!*");
		System.out.println("Have a great day shark!");
		
	}

}
