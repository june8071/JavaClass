import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int a = scan.nextInt();
		
		System.out.println("�ι�° ���� �Է�");
		int b = scan.nextInt();
		
		String c = "";
		
		c = a>b? "ù��° ���ڰ� Ů�ϴ�":"�ι�° ���ڰ�Ů�ϴ�";
		
		int d = a>b? a:b;
		
		System.out.println("��� = "+ c);		
//		System.out.println("��� = " + (c = a>b? "ù��° ���ڰ� Ů�ϴ�":"�ι�° ���ڰ�Ů�ϴ�";));
		
		System.out.println("�� ū ���ڴ� " +d);
	}
}
