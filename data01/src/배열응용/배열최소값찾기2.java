package �迭����;

import java.util.Random;

import �迭�⺻.Print;

public class �迭�ּҰ�ã��2 {

	public static void main(String[] args) {
		Random r =new Random();
		int x[]=new int[1000];
		
		for (int i=0; i<1000; i++) {
			x[i]=r.nextInt(1000);
		}
		int max=x[0];
		
		for (int i=0; i<1000; i++) {
			if(max<x[i]) {
				max=x[i];
			}
		}
		System.out.println(max);
		Print.arr(x);
	}

}
