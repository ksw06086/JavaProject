package ch10;

import java.util.HashMap;
import java.util.Iterator;

public class _10_HashMapEx {
	public static void main(String[] args) {
		String[] sample = {"apple", "watermelon", "mango", "banana", "cherry", "apple", "grape", "banana", "apple"};
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < sample.length; i++) {
			if(map.containsKey(sample[i])) {
				map.put(sample[i], map.get(sample[i])+1);
			} else {
				map.put(sample[i], 1);
			}
		}
		System.out.println(map.size());
		Iterator<String> ir = map.keySet().iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.println(key + " : " + map.get(key));
			
		}
	}
}
