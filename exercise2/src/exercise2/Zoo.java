package exercise2;

import java.util.Scanner;

//���� �������� �����غ���

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
		return "�̸�:"+name+"\n����:"+age+"��\n"+"������:"+weight+"kg";
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Zoo dog = new Zoo("�����",7,5);
//		System.out.println(dog);
//		Zoo cat =  new Zoo("��ġ",2,3);
//		System.out.println(cat);
		
		
		Zoo[]arAni = {
				new Zoo("�����",5,7),
				new Zoo("��ġ",4,5),
				new Zoo("�⸰��",45,12),
		};
//		Zoo []arAni = new Zoo[3]; 
		
		for(int i=0; i<arAni.length;i++) {
			//arAni[i]=new Zoo();
			System.out.println(arAni[i]);
//			System.out.println(i+1+"�� ������ �̸� : ");
//			arAni[i].name=sc.next();
//			System.out.println(i+1+"�� ������ ���� : ");
//			arAni[i].age=sc.nextInt();
//			System.out.println(i+1+"�� ������ ������ : ");
//			arAni[i].weight = sc.nextInt();
	
		}
			
	}
	
}
