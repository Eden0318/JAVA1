package day25;

public class Wrapper2 {

	
	public static void main(String[] args) {
		//하나의 배열에 여러가지 다른타입의 값을 넣고 싶다면 object타입으로 만들기
		
		Object[]arData= {"1",10,20};
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		
		//이걸 좀 더 많이씀
		Object[]arData2= {
			new Integer(10),
			new Double(10.5),
			new String("안녕")
		};
		
		
	}

}
