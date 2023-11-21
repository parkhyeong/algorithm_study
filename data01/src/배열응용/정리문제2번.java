package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 정리문제2번 {
	public static void main(String[] args) {
		Random r =new Random();
		int[] numbers = new int[20];
		
		for (int i=0; i<20; i++) {
			numbers[i]=r.nextInt(900);
		}
		int max =numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}
		}
		
		Print.arr(numbers);
		System.out.println(max);
	}
}
