import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	
	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();
		
		hm.put("A1", 1.2);
		hm.put("A2", 1.5);
		hm.put("A5", 1.45);
		hm.put("A10", 2.0);
		hm.put("A15", 2.1);
		
		try {
			getProduct(hm, "A11");
		} catch (NoSuchProductException e){
			System.out.println(e.getMessage());
		}
	}

	private static void getProduct(HashMap hm, String key) throws NoSuchProductException {
		
		Double value = (Double) hm.get(key);
		if(value != null)
			System.out.println("Key: " + key +" value: "+ value); 
		else
			throw new NoSuchProductException("khong co san pham nay");
	     
		
	}

	
	
}
