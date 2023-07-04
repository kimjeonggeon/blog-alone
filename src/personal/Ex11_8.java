package personal;
import java.util.*; 

class Ex11_8 { 
	public static void main(String[] args) { 
		Integer[] arr = { 30, 50, 10, 40, 20 }; 

		Arrays.sort(arr); // Integerê°? ê°?ì§?ê³? ?žˆ?Š” ê¸°ë³¸ ? •? ¬ê¸°ì? compareTo()ë¡? ? •? ¬ 
		System.out.println(Arrays.toString(arr));

		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp()); // DescComp?— êµ¬í˜„?œ ? •? ¬ ê¸°ì??œ¼ë¡? ? •? ¬
		System.out.println(Arrays.toString(arr));
	} // main
}	

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1; // Integerê°? ?•„?‹ˆë©?, ë¹„êµ?•˜ì§? ?•Šê³? -1 ë°˜í™˜

		Integer i  = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		// return i2 - i; ?˜?Š” return i2.compareTo(i);?„ ê°??Š¥
		return i.compareTo(i2) * -1; // ê¸°ë³¸ ? •? ¬?¸ compareTo()?˜ ?—­?ˆœ?œ¼ë¡? ? •? ¬
	}
}
