package Single;
/*
 *패키지명에 .를 사용하면 폴더가 하나 더 만들어진다
 * a.b.c.d
 * a폴더 안에 b폴더 안에 c폴더 안에 d
 */

import java.util.Calendar;

public class SingleMain {
	public static void main(String[] args) {
		//생성자를 private으로 만들어놨기 때문에 new로 접근 못함

		day26.Single s = day26.Single.getInstance();
		s.sayHello();
		
		//Calendar c = Calendar.getInstance();
		
		
		
		
	}
}
