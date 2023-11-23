package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력배열반환_가변길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 40;
		Solution4 s = new Solution4();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution6 {
	public int[] solution(int[] n, int find) {
		//find로 나누어서 30보다 큰 수의 리스트를 구해보세요.
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n.length; i++) {
			if((n[i]/find)>20) {
				list.add(n[i]);
			}
		}
		System.out.println(list);
		System.out.println(list.size());

		int [] answer=null;
		if (list.size()==0) { 
			answer= new int[1];
		}else {
			answer= new int[list.size()];
		}
		return answer;
	}
}
