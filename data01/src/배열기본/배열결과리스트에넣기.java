package �迭�⺻;

import java.util.ArrayList;
import java.util.Arrays;

public class �迭�������Ʈ���ֱ� {

	public static void main(String[] args) {
		int[] n = {100,200, 300, 400, 500};
		
		//1. ��ü �������Ʈ
		Print.arr(n);
		
		//2. 300�̻� ���� ����� ī��Ʈ�ؼ�����Ʈ
		//3. 300�̻� ����ִ� ��ġ�� arraylist�� ��������.
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < n.length; i++) {
			if (n[i]>=300) {
				count++;
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println(list);
		
		for (int index: list) {
			n[index] = n[index]-100;
		}
		
		Print.arr(n);
		
	}

}
