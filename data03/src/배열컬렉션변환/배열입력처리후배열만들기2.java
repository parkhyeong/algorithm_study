package �迭�÷��Ǻ�ȯ;

import java.util.ArrayList;
import java.util.Arrays;

public class �迭�Է�ó���Ĺ迭�����2 {

	public static void main(String[] args) {
		int[] arr = { 110, 22, 330, 440, 55, 660, 77, 880, 99 };
		// ����� �迭�� ��Ƽ� ���!!!
		// ==> �� ������ �� ��(����) --> collection(ArrayList)
		ArrayList<Integer> list = new ArrayList<>();
		
		// �� ��� �� 10�� ����� ���ڵ鸸 ��ƺ���.!
		// 1. for��(�迭 ��ȸ) + if��(10�� ��� ����) 
		//==> list�� ������!
		for (int x : arr) {  //O(n), O(N) ==> 9
			if (x % 10 == 0) {
				list.add(x);
			}
		}
		// 2. �� ������ �����, list ��ϵ� ����Ʈ!
		System.out.println(list.size());
		System.out.println(list);
		// 3. answer�迭�� �ű�����ؼ� �迭�� ������.
		int[] answer = new int[list.size()];
		//				{0,0,0,0,0}
		
		// 4. list�� �ִ� ���� ������ �迭�� �ű���.!
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		// 5. ��� �迭�� �� ����� ����Ʈ!
		System.out.println(Arrays.toString(answer));
		
		
		
		
	}

}