package single;

public class Stadium {
	public static void main(String[] args) {
		//생성자를 만들 수 없음, 클래스로 직접 접근한다.
		//아이언맨은 오직 한명
		IronMan.fight();
		//만약에 객체를 만들어서 하나 쓰고 싶다면, 
		//new하지말고 getInstance를 이용해서 이미 만들어놓은거 써
		//
		IronMan i = IronMan.getInstance();
		i.walk();
	}
}
