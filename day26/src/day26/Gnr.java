package day26;

public class Gnr {
	public static void main(String[] args) {
		
		//<>안에 wrapper 클래스만 올 수 있다
		GTest <String> g =new GTest<>();
		GTest <Integer> g2 =new GTest<>();
		
		//g.setData(10); 불가능
		g.setData("안녕");
		
		g2.setData(new Integer(10));
		g2.setData(10);
		System.out.println(g.getData());
		System.out.println(g2.getData());
		
		
		
	}

}
