package marker;

public class Phone3G implements Phone {
	
	@Override
	public void msg(String str, String tel) {
		System.out.println(str+"내용이 도착했습니다");
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"에게 전화 거는 중");
		
	}
	@Override
	public void useInternet() {
		System.out.println("웹서핑중");
	}
	
	public static void main(String[] args) {
		Phone3G folder = new Phone3G();
		folder.call("해림");
		
		
	}

}
