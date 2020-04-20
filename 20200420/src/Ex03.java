import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int a = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int b = scan.nextInt();
		
		System.out.println("첫번째숫자 = "+a);
		System.out.println("두번째숫자 = "+b);
		
		if (a > b) {
			System.out.println("a가 큽니다");
		}else if( a < b) {
			System.out.println("b가 큽니다");
		}else {
			System.out.println("a와 b는 같습니다");
		}
	}
}
