package personal;
import java.util.*;

class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// ?λ©΄μΌλ‘λ??° ?Ό?Έ?¨?λ‘? ?? ₯λ°λ?€.

		while(true) {
			System.out.println("id?? passwordλ₯? ?? ₯?΄μ£ΌμΈ?.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("?? ₯??  id? μ‘΄μ¬?μ§? ??΅??€. ?€? ?? ₯?΄μ£ΌμΈ?.");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("λΉλ?λ²νΈκ°? ?ΌμΉνμ§? ??΅??€. ?€? ?? ₯?΄μ£ΌμΈ?.");
			} else {
				System.out.println("id?? λΉλ?λ²νΈκ°? ?ΌμΉν©??€.");
				break;
			}
		} // while
	} // main? ?
}
