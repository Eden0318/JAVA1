package day26;

public class Generic {
	public static void main(String[] args) {
		GTest<String> g =new GTest<>();	
		GTest<Integer> g2 =new GTest<>();
		
		g.setData("�ȳ�");
		g2.setData(new Integer(10));
		System.out.println(g.getData());
		System.out.println(GTest2.function(3.9F));
		System.out.println(GTest2.function(10));
		System.out.println(GTest2.function('A'));
		System.out.println(GTest2.function("hello"));
		
	}
}
