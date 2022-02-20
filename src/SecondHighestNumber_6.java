
public class SecondHighestNumber_6 {
	public static void main(String[] args) {
		double [] numbersArray  = {5, 10, 25, 30, 60, 70, 12, 80};
		System.out.println(numbersArray[5]);
		System.out.println(numbersArray.length);
		double high = 0, low = 0;
	
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i]> high) {
				low = high;
				high = numbersArray[i];
			} else if (numbersArray[i] > low) { 
				low = numbersArray[i];
			}
		}
		System.out.println("The second lowest number in the array is " + low + ".");
	}
}
