import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("����ġ ����");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		// ���� �ڵ����� ctrl + shift + f
		switch (input) {
		case 1:
			System.out.println("1�Է�");
			break;

		case 2:
			System.out.println("2�Է�");
			break;

		case 3:
			System.out.println("3�Է�");
			break;

		default:
			System.out.println("1~3�̿� �Է�");
			break;
		}
	}

}
