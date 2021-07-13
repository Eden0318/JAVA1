package day22;

public class Starbucks {
	
	private String []menu= {"�Ƹ޸�ī��","����Ƽ","īǪġ��"};
	private int[]arPrice= {5000,8000,9000};
	private int income;
	String choice="īǪġ��";
	
	
	public String[] getMenu() {
		return menu;
	}
	
	public void setMenu(String[] menu) {
		this.menu = menu;
	}
	
	public int[] getArPrice() {
		return arPrice;
	}
	
	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}
	
	public int getIncome() {
		return income;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	
	public void registCafe(Cafe c) {
		c.setMenu(menu);
		System.out.println("ī���ϿϷ�");
		System.out.println("----------Menu---------");
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1+c.getMenu()[i]);
		} 
		c.sell(choice);
	}
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks suwon = new Starbucks();
		//cafeŸ�� - �������̽� - new Cafe()�� ���� �ּҰ� ����
		//new Cafe()��� �ϴ� ������ �������̽��� �������Ϸ���
		//�������̽� Ÿ������ ���� ������ ��Ÿ������ �������� �޴����̰� �����ϱ� ���� ������ ����Ϸ���
		//������ �� �ɷ� sell�Ѵ�.
		
		gangnam.registCafe(new Cafe() {
			
			@Override
			public void setMenu(String[] menu) {
				gangnam.menu = menu;
				
			}
			
			@Override
			public void sell(String choice) {
				for (int i = 0; i < gangnam.getMenu().length; i++) {
					if(gangnam.getMenu()[i].equals(choice)) {
						gangnam.income+=gangnam.arPrice[i];
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return gangnam.menu;
			}
		});
		
		
		
		/*
		suwon.registCafe(new Cafe() {
			
			@Override
			public void setMenu(String[] menu) {
				System.out.println("�����޴� �����ϱ�");
				suwon.menu=menu;
				
			}
			
			@Override
			public void sell(String choice) {
				for (int i = 0; i < suwon.getMenu().length; i++) {
					if(suwon.getMenu()[i].equals(choice)) {
						suwon.income+=suwon.arPrice[i];
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				System.out.println("�����޴�����ϱ�");
				return suwon.menu;
			}
		});
		*/
		System.out.println("īǪġ�� �ֹ� �Ϸ�");
		System.out.println("������� : "+gangnam.getIncome());
		
	}
	
}
