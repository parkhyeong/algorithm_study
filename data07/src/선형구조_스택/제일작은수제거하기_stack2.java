package ��������_����;

import java.util.Arrays;
import java.util.Stack;

public class ���������������ϱ�_stack2 {
	
	public static void main(String[] args) {
		int[]n= {500, 400, 200, 300, 900};
		
		//stack�� �̿��Ͽ�
		Stack<Integer> stack = new Stack<>();
		//�ִ밪�� ������ ���� �����
		Arrays.sort(n);
		for (int i=0; i<n.length; i++) {
			stack.push(n[i]);
		}
		//1. ������������ �迭�� ��� ����Ʈ�غ�����.
		System.out.println(stack);
		//2. ������������ �迭�� ��� ����Ʈ�غ�����.
		int[] answer=new int[stack.size()-1];
		stack.pop();
		for (int i =answer.length-1; i>=0; i--) {
			answer[i]=stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}
	
	
}
