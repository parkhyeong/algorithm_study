package ��������_����;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class ����Ȯ�ι��� {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.empty()?1:0);

		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (EmptyStackException e) {
			System.out.println("-1");
		}

		
	}

}
