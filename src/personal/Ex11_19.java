package personal;
import java.util.*;
import static java.util.Collections.*;

class Ex11_19 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1,2,3,4,5); 
		System.out.println(list);
		
		rotate(list, 2);  // ?˜¤ë¥¸ìª½?œ¼ë¡? ?‘ ì¹¸ì”© ?´?™ 
		System.out.println(list);

		swap(list, 0, 2); // ì²? ë²ˆì§¸?? ?„¸ ë²ˆì§¸ë¥? êµí™˜(swap)
		System.out.println(list);

		shuffle(list);    // ???¥?œ ?š”?†Œ?˜ ?œ„ì¹˜ë?? ?„?˜ë¡? ë³?ê²? 
		System.out.println(list);

		sort(list, reverseOrder()); // ?—­?ˆœ ? •? ¬ reverse(list);?? ?™?¼ 
		System.out.println(list);
		
		sort(list);       // ? •? ¬ 
		System.out.println(list);
 
		int idx = binarySearch(list, 3);  // 3?´ ???¥?œ ?œ„ì¹?(index)ë¥? ë°˜í™˜
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));

		fill(list, 9); // listë¥? 9ë¡? ì±„ìš´?‹¤.
		System.out.println("list="+list);

		// list?? ê°™ì? ?¬ê¸°ì˜ ?ƒˆë¡œìš´ listë¥? ?ƒ?„±?•˜ê³? 2ë¡? ì±„ìš´?‹¤. ?‹¨, ê²°ê³¼?Š” ë³?ê²½ë¶ˆê°?
		List newList = nCopies(list.size(), 2); 
		System.out.println("newList="+newList);

		System.out.println(disjoint(list, newList)); // ê³µí†µ?š”?†Œê°? ?—†?œ¼ë©? true

		copy(list, newList); 
		System.out.println("newList="+newList);
		System.out.println("list="+list);

		replaceAll(list, 2, 1); 
		System.out.println("list="+list);

		Enumeration e = enumeration(list);
		ArrayList list2 = list(e); 

		System.out.println("list2="+list2);
	}
}
