package ams;

public class AmsField {
	//�װ���, �װ����ȣ, �ִ�°���, �����, ������
	
	//5��(�װ���, �װ����ȣ, �ִ�°���, �����, ������)�� Ư¡�� ���� ����� ������
	//�� ���� �ϳ��� ����⿡ ���� ����, �� ���� �� ����.
	String [][]arrPlane = new String[100][5]; //����� ������
	int cnt; //arrPlane�� ���° ��?, ���������� �ڵ� �ʱ�ȭ
	int rLength = cnt; //100
	int cLength = arrPlane[0].length;//5
	
	//�߰��ϱ�
	void insert(String [] arPlane) {//�Ű�����5��(�װ���, �װ���ȣ, �°��� ��)�� 5ĭ¥�� �迭 �ϳ��� ����
		arrPlane[cnt] = arPlane; //2�����迭[0]=1�����迭; arrPlane[0]�� ù��° �������
		//arrPlane[0]�̶�� 0��° �濡 ù��°����(arPlane)�� ������
		cnt++;
	}
	
	  
	//�˻��ϱ�
	String search(String keyword) { //�װ���� �˻�
		//������� �����װ����� �˻��ϸ� �����װ��� ��� ������ �𸣴ϱ�
		//arIndex�� ũ�⸦ ���� �� ����
		int arIndex[];
		
		String result = "";
		int cnt=0;
		
		//for���� �������� �˻������ �� �� �ִ�
		for (int i = 0; i < rLength; i++) {
				if(keyword.equals(arrPlane[i][0])) { //�װ���� 1�� �� �ε���[0]
					cnt++;
					result+=""+i+","; //���ȣ�� ���⼭ �� �� �ִ�. ����� �װ�������.
			}	
		}
		//for������ ������ cnt��ŭ ĭ ���� ������ָ� �ȴ�.
		arIndex=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arIndex[i]=Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex);
	}
	
	
	//�����ϱ�
	void update() {
		
	}
	
	//�����ϱ�
	void delete() {
		
	}
	
	//��Ϻ���
	String show() {
		
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < rLength+1; i++) {
			result += "��"; //���ο� ������϶����� ��Ʈ�� �ٴ´�.
			for (int j = 0; j < cLength; j++) {
				result += j==cLength-1 ? arrPlane[i][j] : arrPlane[i][j]+ ",  ";
			}
			result += "\n";
		}
		if(cnt == 0) result="��Ͼ���";
		return result;
	}
	
	//�˻���� ���� ex.�װ�:�����װ�
	String show(int[]arIndex) {
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";

		for (int i = 0; i < arIndex.length; i++) {
			result += "��"; 
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j]; //�����װ��� �װ����ȣ, �ִ�°��� �̷�������
				result += j==cLength-1?"":", ";
			}
			//�ϳ��� �װ��� ������ �� �������! �������� �ٿ��ش�
			result+="\n";
		}
		if(arIndex.length == 0) result="�˻��������";
		return result;
	}
}
