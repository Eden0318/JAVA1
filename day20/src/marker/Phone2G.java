package marker;

public class Phone2G extends PhoneAdapter{

	@Override
	public void msg(String str, String tel) {
		System.out.println(tel+"에게 전송중"+"내용:"+str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"에게 전화거는중");
		
	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub
		
	}

}
