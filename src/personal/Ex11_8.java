package personal;
import java.util.*; 

class Ex11_8 { 
	public static void main(String[] args) { 
		Integer[] arr = { 30, 50, 10, 40, 20 }; 

		Arrays.sort(arr); // Integer�? �?�?�? ?��?�� 기본 ?��?��기�? compareTo()�? ?��?�� 
		System.out.println(Arrays.toString(arr));

		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp()); // DescComp?�� 구현?�� ?��?�� 기�??���? ?��?��
		System.out.println(Arrays.toString(arr));
	} // main
}	

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1; // Integer�? ?��?���?, 비교?���? ?���? -1 반환

		Integer i  = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		// return i2 - i; ?��?�� return i2.compareTo(i);?�� �??��
		return i.compareTo(i2) * -1; // 기본 ?��?��?�� compareTo()?�� ?��?��?���? ?��?��
	}
}
