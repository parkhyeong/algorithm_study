package �迭���;

import java.util.Arrays;

public class �迭�ι踸��� {

	public static void main(String[] args) {
		int[] n = { 1, 2, 100, -99, 1, 2, 3 };
		Solution7 s = new Solution7();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution7 {
	public int[] solution(int[] n) {
		int[] answer = null;
		for (int i=0; i<n.length; i++) {
			answer[i]=n[i]*2;
		}
		return answer;
	}
}