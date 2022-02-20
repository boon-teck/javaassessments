import java.util.ArrayList;

public class IterateArrayList_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
		ArrayList<String> brandedBags = new ArrayList<String>();
		brandedBags.add("Louis Vuitton");
		brandedBags.add("Gucci");
		brandedBags.add("Balenciaga");
		brandedBags.add("Burberry");
		brandedBags.add("Chanel");
		brandedBags.add("Coach");
		brandedBags.add("Fendi");
		brandedBags.add("Prada");
		brandedBags.add("Ted Baker");
		brandedBags.add("Givenchy");
		brandedBags.add("Hermès");
		brandedBags.add("YSL");
		System.out.println(brandedBags.size());
		
		//for-loop
		for (int i=0; i < brandedBags.size(); i++) {
			System.out.println(brandedBags.get(i));
		}
		//while-loop
		int startNum = 0;
		while (brandedBags.size() > startNum) {
			System.out.println(brandedBags.get(startNum));
			startNum++;
		}
		//advanced for-loop (for each)
		for(String bag : brandedBags) {
		    System.out.println(bag);
		}
		
		
	}

}
