package �迭����;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		String all ="����, ����, ����, ��ǻ��";
		//1. String[]��  �ٲپ����.
		String[] all2=all.split(", ");
		for (String string : all2) {
			System.out.println(string);			
		}
		//2. �ٲپ����� ������ ���ԵǾ��ִٸ�, ������ ��� ������, �ٽ� �迭�� ��������.
		//3. �������?
		System.out.println(all2.length);
		
		//4. ��ǻ���� ��ġ��?

		int count=0;
		//5. ������ 3���� �̸��� �������?
		for(int i=0; i<all2.length; i++) {
			if (all2[i].length()<3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
