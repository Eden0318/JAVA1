package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dto.StudentVO;

public class ScoreDAO {
	//������ 3����������
	//������ �� �߰��ɼ��� ������ �����迭 - arrayList
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	//�ܺο��� �Ⱦ����� �ϱ� ���� private����
	private ArrayList<Integer> arScore = null;
	private HashMap<StudentVO,ArrayList<Integer>> smsMap = new HashMap<>();
	
	public void join() {
		String isQuit="";
		do{
			System.out.println("=========[�л����� �Է�(�����q)==========");
			System.out.println("�̸� : ");
			String name = sc.nextLine();
			System.out.println("���� : ");
			int age = sc.nextInt();
			//���� �Է� �� ���� ���
			sc.nextLine();
			StudentVO std = new StudentVO(name,age);
			arStudent.add(std);
			System.out.println("���� ���� ���� ������ �Է��ϼ���\n100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("����?");
			//���� �Է� �� ���� ���
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
