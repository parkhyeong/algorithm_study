package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String>();
		set.add("휴지");
		set.add("휴대폰");
		set.add("휴지");
		System.out.println(set);
		Iterator<String> it =set.iterator();
		//set은 반복자를 통해 접근할수 있다.
//		while(it.hasNext()) {
//			String s=it.next();
//			System.out.println(s);
//		}
		for(int i=0; i<set.size(); i++) {
			String s =it.next();
			System.out.println(s);
		}
	}

}
