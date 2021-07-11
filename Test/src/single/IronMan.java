package single;

public class IronMan{
	
	private IronMan() {} //객체를 더이상 만들 수 없도록 private으로 막음
	
	public static IronMan getInstance() {
		IronMan im = new IronMan();
		return im;
	}
	
	public static void fight() {
		System.out.println("빔발사");
	}
	
	public void walk() {
		System.out.println("날아간다");
	}
}
