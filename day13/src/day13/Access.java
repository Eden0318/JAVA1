package day13;

public class Access{
	
	int data1 = 10; //default
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	

	public int getData4() { //private 필드에 접근하기 위해 만든 메서드
		return data4;
	}

	public void setData4(int data4) {
		this.data4 = data4;
	}

	void f() {
		
	}
	
}
class Cloud{ // 여기서 Access의 필드에 접근을 해보자!
	
	void function() {
		Access a = new Access();
		
	}
	
}



