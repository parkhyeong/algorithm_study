package �迭����;

import javax.swing.plaf.SliderUI;

public class ��������345 {

	public static void main(String[] args) {
		String s1 ="������";
		String s2="��¥����";
		
		if(s1.equals(s2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		}
		else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		if (s1.length()>s2.length()) {
			System.out.println("s1�� �� Ů�ϴ�.");
		}
		else if (s1.length()<s2.length()){
			System.out.println("s2�� ��Ů�ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
		
		String s3="���� ��¥ java programmer�� �Ǿ���";
		System.out.println(s3.substring(6,21));
		String s33=s3.substring(6,21);
		System.out.println(s33.toUpperCase());
		
		String s4="2056521";
		char c= s4.charAt(0);
		if(c=='2' || c=='4') {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}

}
