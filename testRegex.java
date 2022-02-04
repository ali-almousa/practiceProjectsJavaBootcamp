package practiceProjects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class testRegex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		ArrayList<String> emails = new ArrayList<>();
		emails.add("sara@simplilearn.com");
		emails.add("osama@hotmail.com");
		emails.add("seraj@gmail.com");
		emails.add("ali@gmail.com");
		emails.add("bob@gmail.com");
		emails.add("tom@hotmail.com");
		emails.add("sally@gmail.com");
		emails.add("nany@gmail.com");
		emails.add("seraj@windows.com");
		emails.add("lolly@simplilearn.com");
		String email;
		while(true) {
			System.out.print("\nEnter your email ID (or 'exit' to terminate the program): ");
			email = input.next();
			if (email.toLowerCase().equals("exit")) { 
				System.out.println("Thanks for using this Email Validator!");
				break;
			}
			
			else if (checkEmailInEmails(emails, email)) {
				System.out.println("Your email ID is successfuly validated! You can proceed.");
			}
			else {
				System.out.println("Wrong email ID! Please try again.");
			}
		}
	}
	public static boolean checkEmailInEmails(ArrayList<String> emails, String target) {	
		
		Pattern p = Pattern.compile(target);
		
		for (String string : emails) {
			//alternative condition: target.equals(string)
			if (p.matcher(string).find()) {
				return true;
			}
		}
		
		return false;
	}

}
