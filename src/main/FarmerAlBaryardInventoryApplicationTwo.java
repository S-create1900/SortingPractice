package main;

import main.animals.Pig;
import main.service.FileService;
import java.util.Arrays;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile(); // Get the array of Pig objects
		String [] pigNames = new String[4];

		// Check if pigs is null (in case of an error reading the file)
		if (pigs == null) {
			System.out.println("No pigs found or there was an error reading the file.");
			return;
		}
		
		// 1. run for loop on the pig array
		for (int i = 0; i < 4; i++) {
			
		// 2. in the for loop create an array called pig names, get the names of the pigs using the 
		//get names getter from the Pig class, 
			String pigName = pigs[i].getName();
			//save it into the pigNames string array
			pigNames[i] = pigName;
		}
		
		//3. Sort the pig names: 
		Arrays.sort(pigNames);
		for (String pigName: pigNames)
			System.out.println(pigName);
		{		
		
	}}
}