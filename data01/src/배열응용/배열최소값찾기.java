package �迭����;

import �迭�⺻.Print;

public class �迭�ּҰ�ã�� {

	public static void main(String[] args) {
		int[]n= {90, 80, 20, 60, 70};
		
		int min=n[0];
		for (int x:n) {
			if(x<min) {
				min=x;
			}
		}
		System.out.println(min);
		Print.arr(n);
	}

}
