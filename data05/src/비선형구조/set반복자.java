package ��������;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class set�ݺ��� {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("�޴���");
		set.add("����");
		set.add("����");
		System.out.println(set);
		//�ݺ���(iterator,���ͷ�����)
		//set�� �ִ� ���� �ϳ��� �������� �ݺ��ڸ� �޾������
		
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
