package ��������_����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ���������������ϱ�_list {

	public static void main(String[] args) {
		//int[] n = { 4, 3, 2, 1, 5 }; //==> {4,3,2,5}
		int[] n = { 5 }; //==> {}
		//����Ʈ�� ��ȯ���Ѽ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			list.add(n[i]);
		}
		System.out.println(list);
		//�ּҰ��� ã�ƶ�.
		int min = Collections.min(list);
		System.out.println(min);
		
		//�ּҰ��� ���켼��.
		list.remove(list.indexOf(min));
		System.out.println(list);
		
		//int[] answer = new int[list.size()];//0~3
		int[] answer = null;//0~3
		//�迭�� �ű���.
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}