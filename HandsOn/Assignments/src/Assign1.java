import java.util.*;

public class Assign1 {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("A", 80);
		map.put("B", 75);
		map.put("C", 72);
		map.put("D", 70);
		map.put("E", 82);
		map.put("F", 78);
		map.put("A", 85);
		//map.put("G", 90);
		
		   
		System.out.println("TreeMap elements:");
		System.out.println(map);
		
		
		Map<String, Integer> reverseTreeMap = map.descendingMap();
		
		System.out.println("ReverseTreeMap elements:");
		System.out.println(reverseTreeMap);
	}
	public static boolean checkMap(TreeMap<String,Integer>map, String name, int value) {
			if(!map.containsKey(name) && !map.containsValue(value)) {
				System.out.println(name);
				System.out.println(value);
			
			return true;
			}
		else {
			System.out.println("Key already present:");
	
		return false;
		}
   }
 }


