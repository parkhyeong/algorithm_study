package ��������_����;

import java.util.Arrays;
import java.util.Stack;

public class ���������������ϱ�_stack {
	
	public static void main(String[] args) {
		int[]n= {4,3,2,1,5};
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<>();
		for( int i=0; i< n.length; i++) {
			stack.push(n[i]);
		}
		System.out.println(stack);
		int[] answer=new int[n.length-1];
		
//		for (int i=0; i<answer.length; i++) {
//			answer[i]=stack.pop();
//		}
		for (int i=answer.length-1; i>=0; i--) {
			answer[i]=stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}
	
	
}
