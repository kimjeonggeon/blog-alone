package personal;
import java.util.*;

class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// ?™”ë©´ìœ¼ë¡œë??„° ?¼?¸?‹¨?œ„ë¡? ?…? ¥ë°›ëŠ”?‹¤.

		while(true) {
			System.out.println("id?? passwordë¥? ?…? ¥?•´ì£¼ì„¸?š”.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("?…? ¥?•˜?‹  id?Š” ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤. ?‹¤?‹œ ?…? ¥?•´ì£¼ì„¸?š”.");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("ë¹„ë?ë²ˆí˜¸ê°? ?¼ì¹˜í•˜ì§? ?•Š?Šµ?‹ˆ?‹¤. ?‹¤?‹œ ?…? ¥?•´ì£¼ì„¸?š”.");
			} else {
				System.out.println("id?? ë¹„ë?ë²ˆí˜¸ê°? ?¼ì¹˜í•©?‹ˆ?‹¤.");
				break;
			}
		} // while
	} // main?˜ ?
}
