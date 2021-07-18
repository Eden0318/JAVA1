package exercise2;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrShop {
	//나이키
	//강남점, 홍대점, 명동점
	//성인, 퀴즈
	//강남점K, 홍대점K, 명동점K
	//강남점A, 홍대점A, 명동점A
	
	public static void main(String[] args) {
		int [][]arrIncome = new int[2][3];
		int []arASum=new int[2];
		int []arBSum=new int[3];
		int sum=0;
		int rLength=arrIncome.length;
		int cLength=arrIncome[0].length;
		
		double []aAvg=new double[2];
		double []bAvg=new double[3];
		double avg=0.0;
		
		String [][]arrName= {
				{"강남점A","홍대점A","신촌점A"},
				{"강남점K","홍대점K","신촌점K"}
				
		};
		
		String []arAName= {"성인","키즈"};
		String []arBName= {"강남","홍대","신촌"};
		String result="";
		String msg="매출액을 입력하세요";
		
		
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				arrIncome[i][j]=Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j]+""+msg));
			
				arASum[i]+=arrIncome[i][j];
				arBSum[j]+=arrIncome[i][j];
				sum+=arrIncome[i][j];
			
			}
		}
		
		for (int i = 0; i < aAvg.length; i++) {
			aAvg[i]=Double.parseDouble(String.format("%.2f", (double)arASum[i]/arBSum.length));
		}
		
			
		for (int i = 0; i < bAvg.length; i++) {
			bAvg[i]=Double.parseDouble(String.format("%.2f",(double)arBSum[i]/arASum.length));
		}
		
		avg=Double.parseDouble(String.format("%.2f",(double)sum/(rLength*cLength)));
		
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				result+=arrName[i][j]+"매출액 : "+arrIncome[i][j]+"만원\n";			
			}
			result+=arAName[i]+arASum[i]+"만원\n";
			result+=arAName[i]+"평균 매출액:"+aAvg[i]+"만원\n";		
		
		}
		for (int i = 0; i < arBSum.length; i++) {
			result+=arBName[i]+"총 매출액"+arBSum[i]+"만원\n";
			result+=arBName[i]+"총 매츌액"+bAvg[i]+"만원\n";
		}
		
	}

}
