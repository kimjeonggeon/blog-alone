package personal;
import java.util.*;

class Ex11_17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("κΉ??λ°?", 90);
		map.put("κΉ??λ°?", 100);
		map.put("?΄?λ°?", 100);
		map.put("κ°μλ°?", 80);
		map.put("??λ°?", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("?΄λ¦? : "+ e.getKey() + ", ? ? : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("μ°Έκ?? λͺλ¨ : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("μ΄μ  : " + total);
		System.out.println("?κ·? : " + (float)total/set.size());
		System.out.println("μ΅κ³ ? ? : " + Collections.max(values));
		System.out.println("μ΅μ?? ? : " + Collections.min(values));
	}
}
