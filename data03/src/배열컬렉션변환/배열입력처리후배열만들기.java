package �迭�÷��Ǻ�ȯ;

import java.util.ArrayList;
import java.util.Arrays;

public class �迭�Է�ó���Ĺ迭����� {

	public static void main(String[] args) {
		int[] arr= {11, 22, 33, 44, 55, 66, 77, 88,99};
		//�� ��� �� 3�� ����� ���ڵ鸸 ��ƺ���.
		//����� �迭�� ��Ƽ� ���!!!
		//==>�� ������ �𸦶�(����) --> collecct
		ArrayList<Integer> list =new ArrayList<>();
		//�� ��� �� 3�� ����� ���ڵ鸸 ��ƺ���!
		//for(�迭 ��ȸ) + if��(3�� ��� ����) ==> list�� ������
		for(int x: arr) {
			if(x %3==0) {
				list.add(x);
			}
		}
		//2. � ���� �����, list��ϵ� ����Ʈ!
		int size = list.size();
		System.out.println(size);
		System.out.println(list);
		
		int[] answer= new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]= list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
