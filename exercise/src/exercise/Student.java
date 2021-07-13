package exercise;

public class Student implements People {

	@Override
	public void eat() {
		System.out.println("급식을 먹는다");

	}

	@Override
	public void work() {
		System.out.println("분식집에서 알바를 한다");

	}

	@Override
	public void study() {
		System.out.println("시간표에 맞춰 공부를 한다");

	}

	@Override
	public void goToSchool() {
		System.out.println("7시까지 등교를 하여 아침 자습을 한다");

	}

}
