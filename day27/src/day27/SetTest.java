package day27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("AB");
		set.add("O");
		set.add("B");
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("A");
		
		System.out.println("총 수 : "+set.size());
		System.out.println(set);
		//반복자 : Iterator(순서부여) : 반복해서 값을 순서대로 뽑을 때 사용한다
		//iter라는 객체 안에 set의 애들이 순서를 부여받고 들어감
		Iterator<String> iter = set.iterator();
		//hasNext는 그 다음에 값이 있니? 값이 없을때까지 반복해
		
		set.remove("AB");
		System.out.println(set.size());
		iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		}
		
	
	
	}

}
