package �迭����;

import java.util.Random;

import �迭�⺻.Print;

public class �����ѹ迭�ִ밪ã�� {

	public static void main(String[] args) {
		Random r= new Random();
		r.setSeed(100);
		int[] numbers= new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=r.nextInt(1000);
		}
		
		Print.arr(numbers);
		int max=numbers[0];
		
		for (int i=0; i<1000; i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}
		}
		System.out.println(max);
	}

}
