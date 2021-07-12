package marker;

public class Phone2G extends PhoneAdapter {

	@Override
	public void msg(String str, String tel) {
		System.out.println(tel+"에게 전송중"+"\n내용:"+str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"에게 전화 거는 중");
		
	}
	
	public static void main(String[] args) {
		Phone2G lollipop = new Phone2G();
		lollipop.call("친구");
		lollipop.msg("어디야?","친구");
		lollipop.turnOn();
		
		
	}

}
