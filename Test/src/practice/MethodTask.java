package practice;
 

public class MethodTask{
	
	int changeNum(int num){
		int result = num+1;
		return result;
	}
	
	void sumNum(int num) {
		int sum=0;
		if(num<1) {
			System.out.println("�ٽ� �Է��ϼ���");
		}else {
			for(int i=1; i<=num; i++) {
				sum+=i;
			}
		System.out.println("��:"+sum);		
		}
	}
	
	void getSumFrom1(int end){
		int result = 0;
		if(end>1) {
			for(int i=1; i<end+1; i++) {
				result+=i;
			}
			System.out.println("��:"+result);
		}else {
			System.out.println("1���� ū ���� �Է��ϼ���");
		}
		
	}
	
	void divide(int num1, int num2){
		double result=0.0;
		if(num2!=0) {
			result = Double.parseDouble(String.format("%.3f", (double)num1/num2));//��°�ι��ڿ���
			System.out.println(result);
		}else {
			System.out.println("0���� ���� �� �����ϴ�");
		}
	}
	
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		//System.out.println(m.changeNum(3));
		//m.getSumFrom1(1);
		//m.sumNum(5);
		m.divide(5, 3);
	}

}
