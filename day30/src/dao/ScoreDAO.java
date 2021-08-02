package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dto.StudentVO;

public class ScoreDAO {
	//국영수 3과목이지만
	//과목이 더 추가될수도 있으니 동적배열 - arrayList
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	//외부에서 안쓰도록 하기 위해 private선언
	private ArrayList<Integer> arScore = null;
	private HashMap<StudentVO,ArrayList<Integer>> smsMap = new HashMap<>();
	
	public void join() {
		String isQuit="";
		do{
			System.out.println("=========[학생정보 입력(종료는q)==========");
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			//나이 입력 후 엔터 상쇄
			sc.nextLine();
			StudentVO std = new StudentVO(name,age);
			arStudent.add(std);
			System.out.println("국어 영어 수학 점수를 입력하세요\n100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("종료?");
			//정수 입력 후 엔터 상쇄
			sc.nextLine();
			isQuit = sc.nextLine();
		}while(isQuit.intern()!= "q");
	}
	
	public void list() {
		
	}
	
	public void search() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
