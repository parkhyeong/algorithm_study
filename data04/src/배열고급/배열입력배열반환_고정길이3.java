package �迭���;

import java.util.Arrays;

public class �迭�Է¹迭��ȯ_��������3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution3 s = new Solution3();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] n) {
		int[] answer=new int[n.length];
		Arrays.sort(n);
		for (int i=0; i<n.length; i++) {
			answer[i]=n[i]*100;
		}
		
		return answer;
	}
}