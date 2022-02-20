import java.util.Scanner;

public class ArmstrongNumber_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Write a Java Program to check Armstrong number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Check if Number is Armstrong:");
		int toCheckArmStrong =  sc.nextInt();
		int digit, sum = 0;
		int tempNum = toCheckArmStrong;
		while (tempNum != 0) {
			digit = tempNum % 10; //get last digit
			sum = sum + digit * digit * digit; // add root of digit to sum 
			tempNum /= 10; //floor division to get rid of last digit
		}
		
		if (toCheckArmStrong == sum) {
			System.out.println(toCheckArmStrong + " is an Armstrong Number.");
		} else {
			System.out.println(toCheckArmStrong + " is not an Armstrong Number.");
		}

	}

}
