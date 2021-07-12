package marker;

public abstract class PhoneAdapter implements Phone {

	public void turnOn() {
		System.out.println("Àü¿ø ÄÑÁü");
	}
	
	
	public void turnOff() {
		System.out.println("Àü¿ø²¨Áü");
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
