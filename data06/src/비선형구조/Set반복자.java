package ��������;

import java.util.HashSet;
import java.util.Iterator;

public class Set�ݺ��� {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String>();
		set.add("����");
		set.add("�޴���");
		set.add("����");
		System.out.println(set);
		Iterator<String> it =set.iterator();
		//set�� �ݺ��ڸ� ���� �����Ҽ� �ִ�.
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
