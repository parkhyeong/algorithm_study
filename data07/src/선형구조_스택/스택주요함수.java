package 선형구조_스택;

import java.util.Stack;

public class 스택주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.push("정길동");
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.contains("김길동"));
		System.out.println(stack.set(0, "파이팅"));
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
