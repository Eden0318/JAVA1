package dto;

public class StudentVO {
	private String name;
	private int age;
	private int number; //1씩증가 번호는 자동부여, 번호는 내가 부여하는것이 아닌 순서대로 들어감
	private static int seq; //new할때마다 초기화 되면 안되니까 static을 붙여줌
	
	public StudentVO() {
	
	}
	
	public StudentVO(String name, int age) {
		this.name=name;
		this.age=age;
		this.number=++seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "번호:"+this.number+"\n이름"+name+"\n나이"+age+"살";
	}
}


