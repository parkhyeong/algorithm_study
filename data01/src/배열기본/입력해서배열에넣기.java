package �迭�⺻;

import java.util.Arrays;
import java.util.Scanner;

public class �Է��ؼ��迭���ֱ� {

	public static void main(String[] args) {
		//�Է��ϴ� ��ü �ʿ� Scanner 
		//���� ���� �����͸� �������� ���� �� �ִ� ��ü 
		//�迭�� ��� 
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		//numbers --> {0,0,0} + length
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("�����Է�>> ");
			numbers[i] = sc.nextInt(); 
		}
		sc.close();//��θ� �ݾ��ּ���.!!
		System.out.println(Arrays.toString(numbers));
	}

}