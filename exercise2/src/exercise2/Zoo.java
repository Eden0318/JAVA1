package exercise2;

import java.util.Scanner;

//동물 세마리를 생성해보자

public class Zoo {
	String name;
	int weight;
	int age;
	
	public Zoo() {
		
	}

	public Zoo(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름:"+name+"\n나이:"+age+"살\n"+"몸무게:"+weight+"kg";
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Zoo dog = new Zoo("방울이",7,5);
//		System.out.println(dog);
//		Zoo cat =  new Zoo("참치",2,3);
//		System.out.println(cat);
		
		
		Zoo[]arAni = {
				new Zoo("방울이",5,7),
				new Zoo("참치",4,5),
				new Zoo("기린이",45,12),
		};
//		Zoo []arAni = new Zoo[3]; 
		
		for(int i=0; i<arAni.length;i++) {
			//arAni[i]=new Zoo();
			System.out.println(arAni[i]);
//			System.out.println(i+1+"번 동물의 이름 : ");
//			arAni[i].name=sc.next();
//			System.out.println(i+1+"번 동물의 나이 : ");
//			arAni[i].age=sc.nextInt();
//			System.out.println(i+1+"번 동물의 몸무게 : ");
//			arAni[i].weight = sc.nextInt();
	
		}
			
	}
	
}
