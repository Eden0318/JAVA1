package day22;

/*메뉴판
 * 판매
 * 
 */

public interface Cafe {

	//interface이기 때문에 전부 추상메서드임
	void setMenu(String[]menu);
	String[] getMenu();
	void sell(String choice);
	
}
