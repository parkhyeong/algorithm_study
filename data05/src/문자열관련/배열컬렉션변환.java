package ���ڿ�����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class �迭�÷��Ǻ�ȯ {
	public static void main(String[] args) {
		String[] s3= {"�ڸ��","���缮","������","����ȿ","����"};
		List<String> list =Arrays.asList(s3);
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s3));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list2);
		Collections.reverse(list2);
		for(int i=0; i<list2.size(); i++){
			String s2= list2.get(i);
			if(s2.length()<3) {
				list2.remove(i);
			}
		}
		int index=list2.indexOf("���缮");
		list2.set(index,"���絹");
		System.out.println(list2);
		
		list2.add(3,"������");
		System.out.println(list2);
	}

}
