package day26;

public class Calc implements GInter<Double, Integer>{

	@Override
	public Double add(Double data1, Double data2) {
		return data1+data2;
	}

	@Override
	public Double sub(Double data1, Integer data2) {
		return data1-data2;
	}

	@Override
	public Integer mul(Integer data1, Integer data2) {
		return data1*data2;
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(5.9, 12.23));
		System.out.println(c.sub(5.9, 12));
		System.out.println(c.mul(5, 12));
		
	}
	
}





