package day25;

public class Arr {
	
	public static void main(String[] args) {
		String []arData= {"�ȳ�","�ݰ���","�̸���","����?"};

			
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//String i ���� ����, i��� �����ȿ� ���� ��
		
		for(String i:arData) {
			System.out.println(i);
		}
		
		int [][]arrScore= {
				{10,20,30},//1���л�
				{11,25,39},//2���л�
				{12,26,38},
				{13,27,37},
				{14,28,36}
				
		};
		
		int total=0;
		double avg=0.0;
		int cnt=0;
		
		//�� �л��� ������ ��� ����ϱ�
		for (int []arScore:arrScore) {
			total=0;
			cnt++;
			for(int score:arScore) {
				total+=score;
			}
			System.out.println(cnt+"�� ����:"+total+"��");
			avg=Double.parseDouble(String.format("%.2f",(double)total/arScore.length));
			System.out.println(cnt+"�� ���:"+avg+"��");
		}

	}

}

