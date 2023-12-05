package 비선형구조;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] num = new int[3][];
		//{			{0,0,0}
		//			{0,0,0}
		//			{0,0,0}	 		}
		//2차원 배열 ==> 1차원 배열의 결합
		//{
		//			{0,0,0}
		//			{0,0}
		//			{0,0,0,0,0}
		//}
		int[] row1 = {2,5,3};
		int[] row2 = {1,2};
		int[] row3 = {5,4,3,2,1};
		
		for(int i=0; i< num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(num[0][2]);
	}

}