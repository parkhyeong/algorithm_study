package ��������_ť;

import java.util.LinkedList;

public class ����ť���� {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.get(queue.size()-1));
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		try {
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println(queue.pop());
		} catch (Exception e) {
			System.out.println(-1);
		}

		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		try {
			System.out.println(queue.pop());
		}catch (Exception e) {
			System.out.println(-1);
		}
		
		System.out.println(queue.add(3));
		System.out.println(queue.isEmpty());
		System.out.println(queue.element());
	}

}
