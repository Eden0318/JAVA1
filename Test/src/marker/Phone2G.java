package marker;

public class Phone2G extends PhoneAdapter {

	@Override
	public void msg(String str, String tel) {
		System.out.println(tel+"���� ������"+"\n����:"+str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"���� ��ȭ �Ŵ� ��");
		
	}
	
	public static void main(String[] args) {
		Phone2G lollipop = new Phone2G();
		lollipop.call("ģ��");
		lollipop.msg("����?","ģ��");
		lollipop.turnOn();
		
		
	}

}
