package sb24_csc320_mod1_ct1_option1_figueroa_joshua;

import java.util.Scanner;

public class PeopleInfo {

	public static void main(String[] args) {
		// Declarations
		Scanner input = new Scanner(System.in);
		
		// user inputs a person's information
		System.out.println("Enter a person's first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter the person's last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter the person's street address: ");
        String streetAddress = input.nextLine();

        System.out.println("Enter the person's city: ");
        String city = input.nextLine();

        System.out.println("Enter the person's zip code: ");
        String zipCode = input.nextLine();
		
     // Output person's info onto individual lines
        System.out.println("First name: " +firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Street address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip code: " + zipCode);
        
        input.close(); // close the scanner
	// end main
	}

}
