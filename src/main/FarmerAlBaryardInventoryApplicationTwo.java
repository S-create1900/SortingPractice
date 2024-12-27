package main;

import main.animals.Pig;
import main.service.FileService;
import java.util.Arrays;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile(); // Get the array of Pig objects

		// Check if pigs is null (in case of an error reading the file)
		if (pigs == null) {
			System.out.println("No pigs found or there was an error reading the file.");
			return;
		}

		// 1. Sort the pigs by name
		Arrays.sort(pigs, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		// 2. Print sorted pigs
		for (Pig pig : pigs) {
			System.out.println(pig.getName()); // Print only each pig's name
		}

		// 3. If you want to find the loudest animal based on some other criteria, you
		// can implement that logic here.
		// For now, we will just print a message.
//        System.out.println("\nNote: Loudness attribute is not included in this implementation.");
	}
}