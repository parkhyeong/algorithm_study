package ��������_����;

import java.util.ArrayList;
import java.util.Arrays;

public class ���������������ϱ� {
	public static void main(String[] args) {
		int n[] = { 4, 3, 2, 1, 5 };
		//���� ���� ���� ����, �������� �迭�� ��ƶ�!
		//�ϳ� ���� �ƹ��͵� ���� ��쿡�� �迭�� -1�� �־��!
		//1. ������ �ؼ� ���� ���� �ִ� ���� ���� ���� ��!
		//2. Collections.min(�÷���)
		int [] n2 = n.clone();
		System.out.println(n);
		System.out.println(n2);
		Arrays.sort(n2);
		System.out.println(Arrays.toString(n2));
		int min= n2[0];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i< n.length; i++) {
			if(n[i]!=min) {
				list.add(n[i]);
			}
		}
		int[] answer = new int[list.size()];//0~3
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(list);
		System.out.println(Arrays.toString(answer));
	}
}
