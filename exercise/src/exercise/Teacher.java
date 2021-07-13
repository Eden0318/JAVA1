package exercise;

public class Teacher extends School {

	@Override
	public void eat() {
		System.out.println("밖에서 사먹거나 급식을 먹는다");
		
	}

	@Override
	public void work() {
		System.out.println("학생관리를 한다");
		
	}


	@Override
	public void goToSchool() {
		System.out.println("9시까지 출근한다");
		
	}


}
