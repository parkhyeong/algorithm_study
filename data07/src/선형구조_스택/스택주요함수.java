package ��������_����;

import java.util.Stack;

public class �����ֿ��Լ� {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("ȫ�浿");
		stack.add("��浿");
		stack.add("�۱浿");
		stack.push("���浿");
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.contains("��浿"));
		System.out.println(stack.set(0, "������"));
		System.out.println(stack);
		System.out.println(stack.size());
		
		for (int i=0; i<stack.size(); i++) {
			System.out.println(i+": "+stack.get(i));
		}
		
		for (String s : stack) {
			System.out.println(s);
		}
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		
		stack.clear();
		System.out.println(stack);
	}

}
