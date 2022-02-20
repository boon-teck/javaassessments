import java.util.Scanner;

public class SwapTwoNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.Write a Java Program to swap two numbers using the third variable.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input X");
		int firstNumber = sc.nextInt();
		System.out.println("Input Y");
		int secondNumber = sc.nextInt();
		System.out.println("Before Swap X: "+firstNumber);
		System.out.println("Before Swap Y: "+secondNumber);
		
		int swap;
		swap = firstNumber;
		firstNumber = secondNumber;
		secondNumber = swap;
		
		System.out.println("Post Swap X: "+firstNumber);
		System.out.println("Post Swap Y: "+secondNumber);
	}

}
