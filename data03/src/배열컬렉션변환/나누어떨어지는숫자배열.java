package �迭�÷��Ǻ�ȯ;

import java.util.ArrayList;
import java.util.Arrays;

public class ����������¼��ڹ迭 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] n = { 2, 36, 1, 3 };
		int div = 1;
		int[] result = s.solution(n, div);
		System.out.println(Arrays.toString(result));
	}
}

class Solution10 {
	public int[] solution(int[] n, int div) {// �迭, ���������¼�
		// int[] answer = new int[4];
		// �迭���� ������ 5�� ����� ����ּ���.!
		// ==> ����, �����͸� ������ �ʹ�. --> �÷���
		// ==> list
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : n) {
			if (x % div == 0) { //div�� ���!
				list.add(x);// [5, 10]
			}
		}
		// ���� ��, ������ �����.!
		int size = list.size();//2
		
		///////////////�⺻�� �ʱ�ȭ(�ش簪), ������ �ʱ�ȭ(null)
		int[] answer = null; //���������� �����Ⱚ!
		//�ڹٴ� "Ÿ�Ը� ������"��� �� �� 
		//ram�� ��������� �Ҵ� 
		if (size == 0) { //����� ���� �� 
			answer = new int[1];
			answer[0] = -1;
		} else {  //����� ���� �� 
			answer = new int[size];
			//list���� ������ �迭�� �־��.
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}//[2, 36, 1, 3]
			Arrays.sort(answer);
		}
		
		return answer;
	}
}