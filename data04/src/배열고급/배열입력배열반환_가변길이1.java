package �迭���;

import java.util.ArrayList;
import java.util.Arrays;

public class �迭�Է¹迭��ȯ_��������1 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 40;
		Solution4 s = new Solution4();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution4 {
	public int[] solution(int[] n, int find) {
		//���ǿ� �����ϴ� ������ ����Ʈ�� �� ���� ���� �𸣰���.
		//����������. ==> ���ǿ� �´� ����Ʈ�� �ϴ� ���� ��
		//                ���߿� ���� �����͸� �迭�� �ű�� �ȴ�.
		//�������� ����Ʈ�� ������ ���� ��ǰ�� �ʿ�!
		//�迭�� X(��������), ArrayList O(��������)
		//�ݵ�� 1�� ����.
		ArrayList<Integer> list = new ArrayList<>();
		//�迭�� �ִ� ������ �ݺ���(for)�� ���ؼ� �ϳ��� ���� ��
		//find�� 40���� ū ������ ������ �˻��ؼ� 
		//������ list.add(��);
		for (int i = 0; i < n.length; i++) {
			if(n[i] > find) {
				list.add(n[i]);
			}
		}
		System.out.println(list);
		System.out.println(list.size());
		//�迭�� �ű���.!!
		int[] answer = new int[list.size()];
		//list���� �ϳ��� ������ �迭�� ���� �ε����� �־�����.
		//�ݺ���(for) �ʿ�.
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}