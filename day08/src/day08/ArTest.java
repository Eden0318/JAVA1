package day08;

public class ArTest {
	public static void main(String[] args) {
		int []arData = new int[4];
		int arPrice[] = {1000,2000,3000};
		System.out.println(arData);
		arData[0]=10;
		System.out.println(arData[0]);
		System.out.println(arData[1]);//0���� �ڵ��ʱ�ȭ
		System.out.println(arData.length);
		
		for (int i = 0; i < arPrice.length; i++) {
			if (arPrice[i] == 2000){
				System.out.println("�ݶ� �ֽ��ϴ�.");
			}
		}
		
	}

}
