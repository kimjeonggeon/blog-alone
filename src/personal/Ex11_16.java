package personal;
import java.util.*;

class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// ?��면으로�??�� ?��?��?��?���? ?��?��받는?��.

		while(true) {
			System.out.println("id?? password�? ?��?��?��주세?��.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("?��?��?��?�� id?�� 존재?���? ?��?��?��?��. ?��?�� ?��?��?��주세?��.");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비�?번호�? ?��치하�? ?��?��?��?��. ?��?�� ?��?��?��주세?��.");
			} else {
				System.out.println("id?? 비�?번호�? ?��치합?��?��.");
				break;
			}
		} // while
	} // main?�� ?��
}
