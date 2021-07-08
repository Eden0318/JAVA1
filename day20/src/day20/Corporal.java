package day20;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("편하게 먹는다");

	}

	@Override
	public void work() {
		System.out.println("책임감을 가지고 한다.");

	}

	@Override
	public void play() {
		System.out.println("취미 활동이 생긴다.");

	}

	@Override
	public void sleep() {
		System.out.println("잘 잔다");

	}

	@Override
	public void salute() {
		System.out.println("ㅊㅅ");
	}

}
