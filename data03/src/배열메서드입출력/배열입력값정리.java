package �迭�޼��������;

import java.util.Arrays;

import �迭�⺻.Print;

public class �迭�Է°����� {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99};
		//1. �迭�� ����� ���ؼ� ����Ʈ
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum+=n[i];
		}
		System.out.println((double)sum/n.length);
		
		//2. �迭�� �ּҰ��� 3���� ã�Ƽ� ���ؼ� ����Ʈ
		Arrays.sort(n);
		Print.arr(n);
		int small= n[0]+n[1]+n[3];
		System.out.println(small);
		
		//3. �迭�� �߾Ӱ��� ���ؼ� ����Ʈ		
		// Ȧ���� ���) �߾Ӱ��� 10�� ���ؼ� ����Ʈ
		// ¦���� ���) �߾Ӱ����� ���ؼ� ����Ʈ
		if(n.length%2==0) {
			//1. �߾���ġ�� ã�´�, 2��
			int median = n.length/2; //�� ��ġ
			int median2= n.length/2-1; // �� ��ġ
			//2. �߾���ġ�� �ִ� ������ ���Ѵ�.
			System.out.println(n[median]*n[median2]);
		} else {
			int median = n.length/2; //�� ��ġ
			System.out.println(n[median]*10);
		}
		
	}

}
