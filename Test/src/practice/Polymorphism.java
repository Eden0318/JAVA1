package practice;

import java.util.Random;

class Avengers{
	public void fight() {
		System.out.println("Avengers Assemble");
	}
}

class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("Beam!");
	}
}

class Thor extends Avengers{
	@Override
	public void fight() {
		System.out.println("Thunder from Hammer");
	}
}

class Hulk extends Avengers{
	@Override
	public void fight() {
		System.out.println("Big green monster");
	}
}

class CaptianAmerica extends Avengers{
	@Override
	public void fight() {
		System.out.println("Throw the Shield");
	}
}

class HawkEye extends Avengers{
	@Override
	public void fight() {
		System.out.println("Arrow Bomb");
	}
}

class BlackWidow extends Avengers{
	@Override
	public void fight() {
		System.out.println("Kick and Punch");
	}
}

//Car noOptionFerrari = new SuperCar();
//Avengers a = new IronMan();
//Avengers a = new Hulk();
//Avengers a = new CaptianAmerica();
//Avengers a = new BlackWidow();



class Loki extends Avengers{
	@Override
	public void fight() {
		System.out.println("Duplication");	
	}
}


public class Polymorphism {
	

	//어벤져스 타입으로 각 자식클래스들의 생성자들 호출하는것 - upcasting
	public void whoAreYou(Avengers a){
		if(a instanceof IronMan) {
			 System.out.println("아이언맨 들어옴");
		}else if(a instanceof Thor) {
			System.out.println("토르 들어옴");
		}else if(a instanceof Hulk){
			System.out.println("헐크 들어옴");
		}else if(a instanceof CaptianAmerica) {
			System.out.println("캡틴 들어옴");
		}else if(a instanceof BlackWidow) {
			System.out.println("블랙위도우 들어옴");
		}else if(a instanceof HawkEye) {
			System.out.println("호크아이 들어옴");
		}else if(a instanceof Loki) {
			System.out.println("We found Loki!");
		}else {
			System.out.println("악당!");
		}
	}

	public static void main(String[] args) {
		
		Polymorphism p = new Polymorphism(); 
		Random r = new Random();
		Avengers[] avengers= {
			new IronMan(),
			new Thor(),
			new CaptianAmerica(),
			new HawkEye(),
			new Hulk(),
			new BlackWidow()
		};
		
		for(int i=0; i<10; i++) {
			int index = r.nextInt(6);
			p.whoAreYou(avengers[index]);
			
		}
	
	}

}
