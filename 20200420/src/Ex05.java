import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("스위치 공부");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		// 라인 자동정렬 ctrl + shift + f
		switch (input) {
		case 1:
			System.out.println("1입력");
			break;

		case 2:
			System.out.println("2입력");
			break;

		case 3:
			System.out.println("3입력");
			break;

		default:
			System.out.println("1~3이외 입력");
			break;
		}
	}

}
