package day06;
/*
 * 밥먹으러갈래?
 * 1.아니
 * 2.그래
 * 3.이미 먹었어
 * 4.어떤거 먹으러 갈까?
 * */
import java.util.Scanner;

public class Film {
	public static void main(String[] args) {
		String q = "밥 먹으러 갈래?^^\n"
				+ "1.아니\n"
				+ "2.그래\n"
				+ "3.이미 먹었어\n"
				+ "4.어떤거 먹으러 갈까?\n";
		Scanner sc =new Scanner(System.in);
		int choice=0;
		
		System.out.println(q);
		choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("그래~");
			System.out.println("게임오버");
			break;
		case 2:
			System.out.println("넌 너무 쉬어 잘가~");
			System.out.println("게임오버");
			break;
		case 3:
			System.out.println("게임오버");
			break;
		case 4:
			System.out.println("돈까스 먹으러 가자!");
			break;
		default:
			System.out.println("그게 무슨 말이야?");
			System.out.println("게임오버");
		}
	}
}
