package 프로그래머스입문;

import java.util.Scanner;

public class 두수의차 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Solution s= new Solution();
		int result= s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}
}

class Solution {
	public int solution(int num1, int num2) {
		int answer=0;
		return answer;
	}
	
}
