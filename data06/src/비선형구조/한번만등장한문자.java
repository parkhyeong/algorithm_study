package ��������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class �ѹ��������ѹ��� {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public String solution(String s2) {//"abcabcadc"
		//1. String�� �ϳ��� �и����Ѷ�. 
		//   array, list(**)
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i) + "");
		}
		//System.out.println(list);
		//Collections.sort(list);
		
		//2. � �͵��� ����ִ��� ����� ������.!
		//   list�߿��� �ߺ��� �����ϰ� ������ �ȴ�.!
		//   set�̴�.!
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		//System.out.println(set);//set������ �ּҰ� �������.
		//�ּҰ� ����ִ� ������ ������ ����Ʈ�� �� 
		//�� �ּҰ� ����Ű�� ������ ����Ʈ�ϰ� ������
		//�ּҸ� ����ִ� �Լ��� �ٲپ��ָ� �ȴ�.
		//�÷����� toString()�� ��� �ٲ���� ����.(�������̵�)
		//[��,��,��]
		
		//set�� get()�Լ��� ��� �Ұ�.
		//set�ȿ� �ִ� ��(������Ʈ, ���)�� �ϳ��� ������ �� 
		//�ݺ��ڸ� ����ؾ� �Ѵ�. 
		Iterator<String> it = set.iterator();
		String answer = "";
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			int f = Collections.frequency(list, s3);
			if (f == 1) {
				result.add(s3);
				//answer = answer + s3; //answer += s3;
			}
		}
		Collections.sort(result);
		answer = String.join("",result);
		return answer;
	}
}