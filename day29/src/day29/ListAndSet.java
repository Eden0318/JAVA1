package day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList1 = new ArrayList<>(SIZE);
		final Set<Integer> arrayList2 = new HashSet<>(SIZE);
		System.out.println(arrayList1.size());
		System.out.println(arrayList2.size());
		
	}

}
