import java.util.Scanner;

public class IsNumberPrime_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.Write a Java Program to find whether a number is prime or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Prime Number:");
		double toCheckPrime =  sc.nextDouble();
		if (toCheckPrime <= 1) {
			System.out.println(toCheckPrime + " is not a prime number.");
		} else if (toCheckPrime == 2 | toCheckPrime == 3 
				| toCheckPrime == 5 | toCheckPrime == 7 | toCheckPrime == 11) {
			System.out.println(toCheckPrime + " is a prime number. walao.");
		} else if (toCheckPrime % 2 == 0) {
			System.out.println(toCheckPrime + " is not a prime number as it is divisible by 2.");
		} else if (toCheckPrime % 3 == 0) {
			System.out.println(toCheckPrime + " is not a prime number as it is divisible by 3.");
		} else if (toCheckPrime % 5 == 0) {
			System.out.println(toCheckPrime + " is not a prime number as it is divisible by 5.");
		} else if (toCheckPrime % 7 == 0) {
			System.out.println(toCheckPrime + " is not a prime number as it is divisible by 7.");
		} else if (toCheckPrime % 11 == 0) {
			System.out.println(toCheckPrime + " is not a prime number as it is divisible by 11.");
		} else {
			System.out.println(toCheckPrime + " is a prime number as it is only divisible by itself and 1.");
		}
	}

}
