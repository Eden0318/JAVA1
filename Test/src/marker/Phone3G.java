package marker;

public class Phone3G implements Phone {
	
	@Override
	public void msg(String str, String tel) {
		System.out.println(str+"������ �����߽��ϴ�");
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"���� ��ȭ �Ŵ� ��");
		
	}
	@Override
	public void useInternet() {
		System.out.println("��������");
	}
	
	public static void main(String[] args) {
		Phone3G folder = new Phone3G();
		folder.call("�ظ�");
		
		
	}

}
