package exercise2;

public class ObjectTest {
	public static void main(String[] args) {
		//constant pool : 상수들이 보관된 풀
//		String str1 = "data";
//		String str2 = "data";
//		String str3 = new String("data");
//		String str4 = new String("data");
//		
//		System.out.println(str1 == str2);
		
		
		//intern(): constant pool에 같은 값을 검색!!
		//System.out.println(str3.intern()==str4.intern());
		//그래서 주소는 다르지만 intern은 같은 값을 검색했기에 true나옴
		
		//주소는 다름
		//System.out.println(str3==str4);
		
		String[]arStr= {
				new String("data1"),
				new String("data2"),
				new String("data3"),
		};
		
		//값과 주소값 비교 -> 당연히 false
		System.out.println(arStr[0] == "data1"); 
		
		//값 비교
		System.out.println(arStr[0].equals("data1")); 
		
		
		
	}

}
