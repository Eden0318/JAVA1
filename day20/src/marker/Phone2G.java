package marker;

public class Phone2G extends PhoneAdapter{

	@Override
	public void msg(String str, String tel) {
		System.out.println(tel+"���� ������"+"����:"+str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"���� ��ȭ�Ŵ���");
		
	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub
		
	}

}
