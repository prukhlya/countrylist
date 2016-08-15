package listOfCountries;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class countryListMain {

	public static void main(String[] args) {
		
		Scanner another = new Scanner(System.in); 
		Scanner another2 = new Scanner(System.in); 
		Scanner menu = new Scanner(System.in); 
		String menuInput;
		String anotherInput;
		String anotherInput2;
		System.out.println("Enter 1 to view the countries currently in the list.");
		System.out.println("Enter 2 to add new countries to the list.");
		menuInput = menu.nextLine();
		
		
		readWrite countryEnter= new readWrite();
	    readWrite countryRead= new readWrite();
		boolean loop = true;
        
	    switch (menuInput) {
	    case "1":
	    	countryRead.readMethod();
	    	break;
	    case "2":
	    	countryRead.writeMethod();
	    	break;
	    }
	    
	   System.out.println("Would you like to enter a new country?"); 
			anotherInput = another.nextLine();
			switch (anotherInput.toUpperCase()) {
			case "Y":
				do {
		    	countryRead.writeMethod();
		    	System.out.println("Would you like to enter a new country?"); 
		    	anotherInput2 = another2.nextLine();
				} while (anotherInput2.equalsIgnoreCase("Y"));
		    	
			case "N":
				break;
			}
	    
	    
		

	} //main

} //class
