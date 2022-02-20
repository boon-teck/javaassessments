import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SteamStringLengthOverThree_8 {
	
	public static void main(String[] args) {
		//8.Count String whose length is more than three using stream api
		//		ArrayList<String> brandedBags = new ArrayList<String>();
	
		List<String> words = Arrays.asList("God","Collect","Stream","Java","Python","SQL");
		//		System.out.println(words);
		
		
		//1. count number of words in list array with more than three words
		long num = words.stream().filter(x -> x.length()> 3).count();
		System.out.println("There are " + num + " words with length more than 3.");
		
		//2. count the number of characters of words in the list with more than three words
        words.stream().filter(x -> x.length()>3).forEach(x -> System.out.println(x+ " has " + x.length() + " characters."));

		
	}
}
