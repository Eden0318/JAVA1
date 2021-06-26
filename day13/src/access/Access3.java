package access;

import day13.Access;

public class Access3 {
	void function() {
		Access a = new Access(); //다른 패키지에서 액세스를 개체화하니 import 생김
		System.out.println(a.getData4()); //다른 패키지의 private이라도 접근이 가능해짐
	}
}
