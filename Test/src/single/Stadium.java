package single;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); private이라 불가능
		//클래스에 직접 접근(static으로 선언한 것만 클래스로 직접 접근 가능)
		IronMan.fight();
		//IronMan.walk(); walk는 static으로 선언한 것이 아니기 때문에 직접접근 불가능
		
		IronMan i = IronMan.getInstance();
		i.fight();//클래스로 직접 접근
		i.walk();
		
	
		
	}
}
