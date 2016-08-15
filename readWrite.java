package listOfCountries;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class readWrite {

	public static void writeMethod() {
		String countryInput = null;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> countryList = new ArrayList <> ();
		
		Path countryPath = Paths.get("\\Users\\admin\\newWorkspace\\week3day1\\src\\listOfCountries.txt");
		File aNewFileObj = countryPath.toFile();

				try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj, true)))) {
					System.out.println("Enter a country to add to the list:");
					
					countryInput = sc.nextLine();
			
					System.out.println("You entered: " + countryInput);
					out.println(countryInput);
			
				} catch (IOException e) {
					e.printStackTrace();
				}
	
			
			
	} // method

	public static void readMethod () {
		
		Path countryPath = Paths.get("\\Users\\admin\\newWorkspace\\week3day1\\src\\listOfCountries.txt");
		File aNewFileObj = countryPath.toFile();
		
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFileObj))) {
			String countriesInList;
			
			while ((countriesInList = in.readLine()) != null) {
			System.out.println(countriesInList);
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
} // class