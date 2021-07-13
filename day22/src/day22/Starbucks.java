package day22;

public class Starbucks {
	
	private String []menu= {"아메리카노","레몬티","카푸치노"};
	private int[]arPrice= {5000,8000,9000};
	private int income;
	String choice="카푸치노";
	
	
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
		System.out.println("카페등록완료");
		System.out.println("----------Menu---------");
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1+c.getMenu()[i]);
		} 
		c.sell(choice);
	}
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks suwon = new Starbucks();
		//cafe타입 - 인터페이스 - new Cafe()를 통해 주소값 전달
		//new Cafe()라고 하는 이유는 인터페이스를 재정의하려고
		//인터페이스 타입으로 받은 이유는 스타벅스의 지점마다 메뉴차이가 있으니까 전부 재정의 계속하려고
		//재정의 된 걸로 sell한다.
		
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
				System.out.println("수원메뉴 설정하기");
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
				System.out.println("수원메뉴출력하기");
				return suwon.menu;
			}
		});
		*/
		System.out.println("카푸치노 주문 완료");
		System.out.println("현재수익 : "+gangnam.getIncome());
		
	}
	
}
