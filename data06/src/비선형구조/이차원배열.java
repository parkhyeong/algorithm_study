package ��������;

public class �������迭 {

	public static void main(String[] args) {
		int[][] num = new int[3][];
		//{			{0,0,0}
		//			{0,0,0}
		//			{0,0,0}	 		}
		//2���� �迭 ==> 1���� �迭�� ����
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