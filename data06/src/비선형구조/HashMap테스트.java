package ��������;

import java.util.HashMap;
import java.util.Set;

public class HashMap�׽�Ʈ {

	public static void main(String[] args) {
		String[] s = {"leo","kiki","eden"};
		String[] c= {"kiki","eden"};
		
		//1. ������ ����� �����.
		HashMap<String, Integer> list = new HashMap<>();
		for(int i=0; i< s.length; i++) {
			list.put(s[i], list.getOrDefault(s[i],0)+1);
		}
		System.out.println(list);
		//2. ������ ������ ������ üũ�Ѵ�.
		for(int i=0; i<c.length; i++) {
			list.put(c[i],list.get(c[i])-1);
		}
		System.out.println(list);
		//3. �������� ���� ������ ������� �ۼ��Ѵ�.
		String answer="";
		//hashmap�� ���� ���� �Լ��� ���� �����.

		Set keys = list.keySet();
		for (Object key: keys) {
			if(list.get(key) !=0) {
				answer=(String) key;
				break;
			}
		}
//		String answer="";
//		for(int i=0; i<s.length; i++) {
//			if(list.get(s[i])!=0) {
//				answer=s[i];
//			}
//		}
		System.out.println(answer);
	}

}
