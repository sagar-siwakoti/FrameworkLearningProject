import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> rollNo= new ArrayList<Integer>();
		rollNo.add(1);
		rollNo.add(2);
	    rollNo.add(4);
		rollNo.add(5);
		rollNo.add(6);
		rollNo.add(3);
		rollNo.add(7);
		System.out.println("Before Sorting");
		rollNo.forEach(r-> System.out.println(r));
		System.out.println("After Sort");
		Collections.sort(rollNo);
		rollNo.forEach(r-> System.out.println(r));
		rollNo.sort(Comparator.reverseOrder());
		System.out.println("Reverse Sort");
		rollNo.forEach(r-> System.out.println(r));
	}
}
