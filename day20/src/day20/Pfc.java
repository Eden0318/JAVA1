package day20;

public class  Pfc implements Soldier {

	@Override
	public void eat() {
		System.out.println("빠르고 정확하게 먹는다.");
		
	}

	@Override
	public void work() {
		System.out.println("이등병에게 일을 알려주며 열심히 일한다.");
		
	}

	@Override
	public void play() {
		System.out.println("오락기를 사용하며 열심히 논다");
		
	}

	@Override
	public void sleep() {
		System.out.println("잘 잔다");
		
	}

	@Override
	public void salute() {
		System.out.println("충!성!");
		
	}

}
