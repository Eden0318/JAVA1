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
		
		System.out.println("�� �� : "+set.size());
		System.out.println(set);
		//�ݺ��� : Iterator(�����ο�) : �ݺ��ؼ� ���� ������� ���� �� ����Ѵ�
		//iter��� ��ü �ȿ� set�� �ֵ��� ������ �ο��ް� ��
		Iterator<String> iter = set.iterator();
		//hasNext�� �� ������ ���� �ִ�? ���� ���������� �ݺ���
		
		set.remove("AB");
		System.out.println(set.size());
		iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		}
		
	
	
	}

}
