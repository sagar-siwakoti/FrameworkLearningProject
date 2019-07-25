import java.util.*;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> rollNo= new ArrayList<Integer>();
	rollNo.add(1);
	rollNo.add(2);
    rollNo.add(4);
	rollNo.add(5);
	rollNo.add(6);
	rollNo.add(3);
	rollNo.add(7);
	System.out.println("Total roll no:"+rollNo.size());
    System.out.println("C style for loop");
	for(int i=0 ; i<rollNo.size(); i++)
		System.out.println(rollNo.get(i));
    System.out.println("Java Enhanced for loop");
	    for(Integer i:rollNo)
             System.out.println(i);
	
   /* System.out.println("Stream/lamda based for loop");
    rollNo.forEach(r ->{
    	System.out.println(r);
    });
*/
	    System.out.println("Printing value from 5th index");
	    System.out.println(rollNo.get(5));

	    System.out.println("Printing value from last index");
	    System.out.println(rollNo.get(rollNo.size()-1));

}



}
