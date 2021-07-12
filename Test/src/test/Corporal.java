package test;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("식사 안하고 px");
		
		
	}

	@Override
	public void work() {
		
	}

	@Override
	public void play() {
		System.out.println("하루종일 논다");
	}

	@Override
	public void sleep() {
		System.out.println("하루종일 잔다");
	}

	@Override
	public void salute() {
		System.out.println("ㅊㅅ");
	}

}
