package �迭���;

import java.util.ArrayList;
import java.util.Arrays;

public class �迭�Է¹迭��ȯ_��������3 {

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
		//find�� ����� 30���� ū ���� ����Ʈ�� ���غ�����.
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
