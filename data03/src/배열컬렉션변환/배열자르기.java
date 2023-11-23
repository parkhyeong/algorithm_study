package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] n= {1,2,3,4,5};
		int start=1;
		int end=3;
		
		int[] result = s.solution(n,start,end);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(int[] n, int start, int end ) {
//		int[] answer = Arrays.copyOfRange(n,start,end+1);
		int[] answer= new int[end - start+1];
		int index=0;
		for (int i = start; i < end + 1; i++) {
			answer[index]=n[i];
			index++;
		}
		return answer;
	}
}