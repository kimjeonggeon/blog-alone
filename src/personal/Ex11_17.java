package personal;
import java.util.*;

class Ex11_17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("ê¹??ë°?", 90);
		map.put("ê¹??ë°?", 100);
		map.put("?´?ë°?", 100);
		map.put("ê°•ìë°?", 80);
		map.put("?•ˆ?ë°?", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("?´ë¦? : "+ e.getKey() + ", ? ?ˆ˜ : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("ì°¸ê?? ëª…ë‹¨ : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("ì´ì  : " + total);
		System.out.println("?‰ê·? : " + (float)total/set.size());
		System.out.println("ìµœê³ ? ?ˆ˜ : " + Collections.max(values));
		System.out.println("ìµœì?? ?ˆ˜ : " + Collections.min(values));
	}
}
