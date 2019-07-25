import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer, String> studentMap= new HashMap<Integer, String>();
	studentMap.put(1,"Alexendra");
	studentMap.put(2,"Natalie");
	studentMap.put(3,"Sagar");
	for(Map.Entry<Integer, String> map : studentMap.entrySet()) {
		Integer key=map.getKey();
		String value=map.getValue();
		if(key==1)
		System.out.println("Key "+key+ "value "+value);
	}
	System.out.println(studentMap.get(1));
}
}
