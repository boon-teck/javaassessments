import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashmap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Write a Java Program to iterate HashMap using While and advance for loop.

		HashMap <String, String> crypto = new HashMap<String,String>();
		
		crypto.put("BTC","Bitcoin");
		crypto.put("DOGE", "Dogecoin");
		crypto.put("ETH", "Etherium");
		crypto.put("LTC", "Litecoin");
		crypto.put("XRP", "Ripple");
		
		System.out.println(crypto);
		//while loop
		Iterator<Entry<String, String>> iterator = crypto.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry<String, String> entry = iterator.next();
             System.out.println("Key: "+entry.getKey() + " & Value: " + entry.getValue());
        }
        
        //advanced for-loop
        for (Map.Entry<String,String> cryptocurrency : crypto.entrySet()) {
            String key = cryptocurrency.getKey();
            String value = cryptocurrency.getValue();
            System.out.println(key+ " - "+value);
        }
		
	}

}
