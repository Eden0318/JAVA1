package exercise2;

import java.util.Random;

class Avengers{
	public void fight() {
		System.out.println("Avengers Assemble");
	}
}

class Hulk extends Avengers{
	@Override
	public void fight() {
		System.out.println("Big green monster!");
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
		System.out.println("Thunder");
	}
}

class BlackWidow extends Avengers{
	@Override
	public void fight() {
		System.out.println("kick and punch");
	}
}


public class Instanceof {
	public void whoAreYou(Avengers a) {
		//i.whoAreYou(new IronMan());
		if(a instanceof IronMan) {
			System.out.println("���̾�� ����");
		}else if(a instanceof Hulk){
			System.out.println("��ũ ����");
		}else if(a instanceof Thor) {
			System.out.println("�丣 ����");
		}else if(a instanceof BlackWidow) {
			System.out.println("�������� ����");
		}else {
			System.out.println("�Ǹ���");
		}
	}
	
	public static void main(String[] args) {
		Instanceof i = new Instanceof();
		Random r = new Random();
		Avengers[]avengers = {
				new IronMan(),
				new Hulk(),
				new BlackWidow(),
				new Thor(),
		};
		
		
		for (int j = 0; j < 10; j++) {
			int index = r.nextInt(4);
			i.whoAreYou(avengers[index]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		
		}
		System.out.println("�׽�Ʈ��"+new IronMan());
		i.whoAreYou(new IronMan());
	}
	
	
}
