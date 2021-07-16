package day24;

/**
 * This one is Calculator
 * 
 * @author Eden
 * @since 2021 07 15
 */

public class Calc {
	/**
	 * To add the following numbers<br>
	 * For example<br>
	 * add(1,3) return 4
	 * 
	 * @param num1 :First Integer for add
	 * @param num2 :Last Integer for add
	 * 
	 */
	
	public static void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	
	
	//³ª´°¼À ¸Þ¼Òµå(try catch)
	/**
	 * Divide num1 by num2.<br>
	 * You can see a Message "Divide by zero"<br>
	 * If you give num2 zero
	 * 
	 * For example 
	 * div(10,5):2
	 * div(10,0):"Divide by zero"<br>
	 * 
	 * @param num1 : Integer type
	 * @param num2 : Integer type
	 * 
	 */
	
	public static void div(int num1, int num2) {
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}
		
	}
	
	
	public static void main(String[] args) {
		Calc.add(1,3);
		Calc.div(4, 2);
	}
}
