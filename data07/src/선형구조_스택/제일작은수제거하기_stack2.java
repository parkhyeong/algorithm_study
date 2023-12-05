package 선형구조_스택;

import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기_stack2 {
	
	public static void main(String[] args) {
		int[]n= {500, 400, 200, 300, 900};
		
		//stack을 이용하여
		Stack<Integer> stack = new Stack<>();
		//최대값을 제외한 값을 목록을
		Arrays.sort(n);
		for (int i=0; i<n.length; i++) {
			stack.push(n[i]);
		}
		//1. 오름차순으로 배열로 모아 프린트해보세요.
		System.out.println(stack);
		//2. 내림차순으로 배열로 모아 프린트해보세요.
		int[] answer=new int[stack.size()-1];
		stack.pop();
		for (int i =answer.length-1; i>=0; i--) {
			answer[i]=stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}
	
	
}
