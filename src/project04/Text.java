package project04;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Text {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("first",1);
		map.put("second",2);
		map.put("third",3);
		
        //����key-values��ʽ1:��ȡkeyset
		Set<String> keyset=map.keySet();
		for(String s:keyset)
		{
			System.out.println(s+" "+map.get(s));
		}
		//����key-values��ʽ2����ȡentryset
		Set<Entry<String, Integer>> set2=map.entrySet();
		for(Entry<String, Integer> e: set2)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	
		//����values����ȡvalues
		Collection<Integer> valueCollection=map.values();
		
		for(Integer i:valueCollection)
		{
			System.out.println(i);
		}
		
	}

}
