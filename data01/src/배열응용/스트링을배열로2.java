package 배열응용;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all ="국어, 영어, 수학, 컴퓨터";
		//1. String[]로  바꾸어보세요.
		String[] all2=all.split(", ");
		for (String string : all2) {
			System.out.println(string);			
		}
		//2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거후, 다시 배열에 넣으세요.
		//3. 과목수는?
		System.out.println(all2.length);
		
		//4. 컴퓨터의 위치는?

		int count=0;
		//5. 과목이 3글자 미만인 과목수는?
		for(int i=0; i<all2.length; i++) {
			if (all2[i].length()<3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
