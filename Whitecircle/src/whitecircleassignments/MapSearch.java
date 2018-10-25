package whitecircleassignments;

	import java.util.HashMap;
	import java.util.Map;

	public class MapSearch {
		
		 public static void print(Map<String, Integer> map) 
		    {
		        if (map.isEmpty()) 
		        {
		            System.out.println("map is empty");
		        }
		         
		        else
		        {
		            System.out.println(map);
		        }
		    }
		 
		 //Added a comment to try git push
		
		public static void main(String[] args) 
	    {
	     
	        HashMap<String, Integer> map = new HashMap<>();
	         
	        print(map);
	        map.put("Tim", 10);
	        map.put("John", 30);
	        map.put("Sam", 20);
	         
	        System.out.println("Size of map is:- " + map.size());
	     
	        print(map);
	        if (map.containsKey("Tim")) 
	        {
	            Integer a = map.get("Tim");
	            System.out.println("value for key \"Tim\" is:- " + map.get("Tim") );
	        }
	         
	        map.clear();
	        print(map);
	    }
	     
	   

	}



