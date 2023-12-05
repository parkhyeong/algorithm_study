package 비선형구조;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class set반복자 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("휴대폰");
		set.add("휴지");
		set.add("휴지");
		System.out.println(set);
		//반복자(iterator,이터레이터)
		//set에 있는 값을 하나씩 꺼내려면 반복자를 달아줘야함
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//array --> list: Arrays.asList()
		//list --> array: list.toArray()
		//set --> array: set.toArray()
		Object[] arr =set.toArray();
		System.out.println(Arrays.deepToString(arr));
	}
}
