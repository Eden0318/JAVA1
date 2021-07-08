package marker;

public abstract class PhoneAdapter implements Phone {
	
	void turnOn() {
		System.out.println("전원 켜기");
	}
	
	void turnOff() {
		System.out.println("전원 끄기");
	}
	
	@Override
	public void msg(String str, String tel) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void call(String tel) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void useInternet() {
		// TODO Auto-generated method stub
		
	}
}
