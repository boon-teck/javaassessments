import java.util.Scanner;

public class CheckPalindrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Write a Java Program to find whether a string or number is palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Palindrome:");
		String toCheck =  sc.nextLine();
		String toCheckAgainst = "";
		for (int i=0; i<toCheck.length();i++) {
			char ch = toCheck.charAt(i);
			toCheckAgainst = ch+toCheckAgainst;
		}
		if (toCheck.toLowerCase().equals(toCheckAgainst.toLowerCase())) {
			System.out.println(toCheck +" is a Palindrome.");
		} else {
			System.out.println(toCheck +" is not a Palindrome.");
		}
	}

}
