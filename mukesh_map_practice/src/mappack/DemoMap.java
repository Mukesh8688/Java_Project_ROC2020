package mappack;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;



public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> hm = new HashMap<>();
		
		System.out.println("Insertion");
		
		hm.put(100,"Mukesh");
		hm.put(101,"Kumar");
		hm.put(102,"Chaudhary");
		hm.put(null,null);
		hm.put(103, null);
		
		System.out.println("hm =" + hm);
		System.out.println("hm =" + hm.toString());
		
		
		System.out.println("LinkedHashMap :");
		
        Map<Integer,String> lhm = new LinkedHashMap<>();
		
		System.out.println("Insertion");
		
		lhm.put(100,"Mukesh");
		lhm.put(101,"Kumar");
		lhm.put(102,"Chaudhary");
		lhm.put(null,null);
		lhm.put(103, null);
		
		System.out.println("lhm =" + lhm);
		System.out.println("lhm =" + lhm.toString());
		
		
		System.out.println("TreeMap:");
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(100,"Mukesh");
		tm.put(101,"Kumar");
		tm.put(102,"Chaudhary");
		//tm.put(null,null); // not allow null in key
		tm.put(103, null);
		System.out.println("lhm =" + tm);
		System.out.println("lhm =" + tm.toString());
		System.out.println("Key :" + tm.keySet());
		System.out.println("Key :" + tm.values());
		
		
		System.out.println("HashTable:");
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(100,"Mukesh");
		ht.put(101,"Kumar");
		ht.put(102,"Chaudhary");
		//tm.put(null,null); // not allow null in key
		//ht.put(103, null); // not allow even in value
		System.out.println("lhm =" + ht);
		System.out.println("lhm =" + ht.toString());
		System.out.println("Key :" + ht.keySet());
		System.out.println("Key :" + ht.values());
		
		//size
		
		System.out.println("ht size :" + ht.size());
		System.out.println("ht get :" + ht.get(100));
		
		System.out.println("ht containKey :" + ht.containsKey(100));
		
		System.out.println("ht size :" + ht.containsValue("Mukesh"));
		System.out.println("ht size :" + ht.containsValue("Preet"));
		
		
		
		// Iteration
		
		System.out.println("Iteration1 using set :");
		Set<Integer> s = ht.keySet();
		
		for(Integer i : s ) {
			System.out.println("Key =" + i + "    Value =" + ht.get(i));
		}
		
		
		
		System.out.println("Iteration using entryset ");
		for(Entry<Integer,String> e :ht.entrySet()) {
			System.out.println("Key ->" + e.getKey() + "   Value ->" +e.getValue());
		}
		
		
		// Iterator Interface
		System.out.println("Iteration using Iteration interface");
		
		Iterator<Entry<Integer,String>> i = ht.entrySet().iterator();
		
		while(i.hasNext()) {
			
			Entry<Integer,String> e = i.next();
			System.out.println("Key->" + e.getKey() + " Value->" + e.getValue());
		}

	}

}
