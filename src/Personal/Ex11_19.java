package personal;
import java.util.*;
import static java.util.Collections.*;

class Ex11_19 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1,2,3,4,5); 
		System.out.println(list);
		
		rotate(list, 2);  // ?€λ₯Έμͺ½?Όλ‘? ? μΉΈμ© ?΄? 
		System.out.println(list);

		swap(list, 0, 2); // μ²? λ²μ§Έ?? ?Έ λ²μ§Έλ₯? κ΅ν(swap)
		System.out.println(list);

		shuffle(list);    // ???₯? ??? ?μΉλ?? ??λ‘? λ³?κ²? 
		System.out.println(list);

		sort(list, reverseOrder()); // ?­? ? ? ¬ reverse(list);?? ??Ό 
		System.out.println(list);
		
		sort(list);       // ? ? ¬ 
		System.out.println(list);
 
		int idx = binarySearch(list, 3);  // 3?΄ ???₯? ?μΉ?(index)λ₯? λ°ν
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));

		fill(list, 9); // listλ₯? 9λ‘? μ±μ΄?€.
		System.out.println("list="+list);

		// list?? κ°μ? ?¬κΈ°μ ?λ‘μ΄ listλ₯? ??±?κ³? 2λ‘? μ±μ΄?€. ?¨, κ²°κ³Ό? λ³?κ²½λΆκ°?
		List newList = nCopies(list.size(), 2); 
		System.out.println("newList="+newList);

		System.out.println(disjoint(list, newList)); // κ³΅ν΅??κ°? ??Όλ©? true

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
