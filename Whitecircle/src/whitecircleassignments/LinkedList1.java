package whitecircleassignments;
import java.util.LinkedList;
import java.util.List;
//import java.util.Linkedlist;
public class LinkedList1 {
		
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
			
			cities.add("London");
			cities.add("Paris");
			cities.add("Tokyo");
			cities.add("New York");
			cities.add("New Delhi");
			
			for (String x : cities){
				System.out.println(x);
			}
	}
}




