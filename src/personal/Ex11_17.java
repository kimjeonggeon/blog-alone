package personal;
import java.util.*;

class Ex11_17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("�??���?", 90);
		map.put("�??���?", 100);
		map.put("?��?���?", 100);
		map.put("강자�?", 80);
		map.put("?��?���?", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("?���? : "+ e.getKey() + ", ?��?�� : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("참�??�� 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("총점 : " + total);
		System.out.println("?���? : " + (float)total/set.size());
		System.out.println("최고?��?�� : " + Collections.max(values));
		System.out.println("최�??��?�� : " + Collections.min(values));
	}
}
