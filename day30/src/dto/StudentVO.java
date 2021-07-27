package dto;

public class StudentVO {
	private String name;
	private int age;
	private int number;
	private static int seq;
	
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
		return "��ȣ:"+this.number+"\n�̸�"+name+"\n����"+age+"��";
	}
}


