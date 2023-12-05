package 비선형구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자2 {

	public static void main(String[] args) {
		String s="abcabcadc";
		String s2[] =s.split("");
		
		List<String> list= Arrays.asList(s2);
		HashSet<String> set =new HashSet<String>();
		
		for (int i=0; i<s2.length; i++) {
			set.add(s2[i]);
		}
		System.out.println(set);
		System.out.println(Collections.frequency(list, "a"));
		
		Iterator<String> it =set.iterator();

		String answer="";
		for(int i=0; i<set.size(); i++) {
			String s3 =it.next();
			System.out.println(s3+": ");
			System.out.println(Collections.frequency(list, s3));
			if(Collections.frequency(list, s3) ==1) {
				answer+=s3;
			}
		}
	}

}
