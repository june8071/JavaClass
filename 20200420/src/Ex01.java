import java.util.Scanner;

/*	cmdâ���� javac�� ������ �ϴ� ��
 * 
 *  ������ : javac Ex01.java  = > Ex01.class ���� ����
 *  ���� : java Ex01  
 * 
 * ��Ŭ������ ����ϱ⶧���� �ڵ� �������� �ȴ�.
 * 
 * debug���. ��Ŭ������忡���� ���Ǵ� ������ ����
 * f6 �� ���ξ� ����
 * f8 ����� ��� ���� or ���� �극��ũ ����Ʈ���� ����
 * 
 * */

public class Ex01 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		/* char a[30[
		 * fgets( a , stdin );
		 * 
		 */
		System.out.println("�Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		System.out.println("inputValue = "+inputValue);
		
	}
}
