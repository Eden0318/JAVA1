package exercise2;

public class Try2 {
	public static void main(String[] args) {
		int [] arData=new int[5];
		
		for(int i=0; i<100; i++) {
			System.out.println(i);
			try {
				arData[i]=i+1;
			} catch (Exception e) {
				break;
			}
		
		}

	}

}
