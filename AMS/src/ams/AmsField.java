package ams;

import java.util.Iterator;

public class AmsField {
	//�װ���, �װ����ȣ, �ִ�°���, �����, ������
	
	//5��(�װ���, �װ����ȣ, �ִ�°���, �����, ������)�� Ư¡�� ���� ����� ������
	//�� ���� �ϳ��� ����⿡ ���� ����, �� ���� �� ����.
	String [][]arrPlane = new String[100][5]; 
	int cnt;
	int rLength = cnt;
	int cLength = arrPlane[0].length;
	
	//�߰��ϱ�
	void insert(String [] arPlane) {
		arrPlane[cnt] = arPlane; 
		cnt++;
		
	}
	
	  
	//�˻�
	void search(String keyword) {
		for (int i = 0; i < rLength; i++) {
			if(keyword.equals(arrPlane[i][0])) {
				
			}
		}
	}
	
	
	//�����ϱ�
	void update() {
		
	}
	
	//�����ϱ�
	void delete() {
		
	}
	
	//"��Ϻ���
	String show() {
		
		String result = "�װ���, �װ����ȣ, �ִ�°���, �����, ������";
		
		for (int i = 0; i < rLength; i++) {
			result += "��";
			for (int j = 0; j < cLength; j++) {
				
				result += j==cLength-1? arrPlane[i][j] : arrPlane[i][j]+ ",  ";
			}
			result += "\n";
		}
		if(cnt == 0) result="��� ����";
		return result;
	}
	
	//�˻���� ����
	void show(int[]arIndex) {
		
	}

}
