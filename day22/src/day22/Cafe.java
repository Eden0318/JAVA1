package day22;

public interface Cafe {
	//메뉴판
	//판매
	//아래 전부 abstract 생략됨. 추상메서드임
	void setMenu(String []menu);
	String []getMenu();
	void sell(String choice);
}
