package �迭�⺻;

import java.util.Arrays;
import java.util.Random;

public class �Է��ؼ��迭���ֱ�2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] numbers= new int[3];
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=r.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
	}

}
