import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int b = scan.nextInt();
		
		System.out.println("ù��°���� = "+a);
		System.out.println("�ι�°���� = "+b);
		
		if (a > b) {
			System.out.println("a�� Ů�ϴ�");
		}else if( a < b) {
			System.out.println("b�� Ů�ϴ�");
		}else {
			System.out.println("a�� b�� �����ϴ�");
		}
	}
}
