package �迭����;

import java.util.Arrays;

import �迭�⺻.Print;

public class ��Ʈ��Ȯ�ι��� {

	public static void main(String[] args) {
		String s1 = "������";
		String s2 = "��¥����";
		
		System.out.println(s1.equals(s2));
		if(s1.length() > s2.length()) {
			System.out.println("s1�� �� ŭ");
		}else {
			System.out.println("s2���� ŭ");
		}
		// ���� "java programmer"�� �����Ͽ� ��� �빮�ڷ� ������ ����Ʈ
		String s3 = "���� ��¥ java programmer�� �Ǿ���";
		System.out.println(s3.substring(6, 21));//6~20
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		
		String s4 = "2056521";
		char c = s4.charAt(0);
		if (c == '2' || c == '4') {
			System.out.println("������. ");
		} else {
			System.out.println("������. ");

		}
		 String s5 = " [  10, 222, 30, 405, 50]";
		 s5 = s5.replace("[", "");
		 s5 = s5.replace("]", "");
		 System.out.println(s5);
		 s5 = s5.trim();
		 System.out.println(s5);
		 String[] s6 = s5.split(", ");
		 Print.arr(s6);
		 int sum = 0;
		 for (String s : s6) {
			sum += Integer.parseInt(s);
			//sum = sum + Integer.parseInt(s);
		}
		 System.out.println(sum);
		 
		 int[] newArr = new int[s6.length];
		 for (int i = 0; i < newArr.length; i++) {
			newArr[i] = Integer.parseInt(s6[i]);
		}
		Print.arr(newArr);
		Arrays.sort(newArr); //������������ ����, �ı���
		Print.arr(newArr);
		
		
		String s10 = "���浿";
		String s20 = "���浿";
		System.out.println(s10 == s20); //�������� �ּ� �� 
		s10 = "ȫ�浿";
		System.out.println(s10 == s20);
		//���������� �ּҰ� ����Ű�� ������ �������� �� 
		//�Լ��� �̿��ؾ���.
		System.out.println(s10.equals(s20));
		
		s10 = "��浿";
		s10 = "�ڱ浿";
		//String�� ����ɶ��� ���ο� �޸𸮿� ���ο� �����
		//�����͸� �ִ´�.! ��ȿ����
		StringBuilder sb = new StringBuilder();
		sb.append("ȫ�浿");
		System.out.println(sb);
		sb.insert(0, "������");
		System.out.println(sb);
	}

}