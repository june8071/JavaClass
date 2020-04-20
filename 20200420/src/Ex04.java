import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력");
		int a = scan.nextInt();
		
		System.out.println("두번째 숫자 입력");
		int b = scan.nextInt();
		
		String c = "";
		
		c = a>b? "첫번째 숫자가 큽니다":"두번째 숫자가큽니다";
		
		int d = a>b? a:b;
		
		System.out.println("결과 = "+ c);		
//		System.out.println("결과 = " + (c = a>b? "첫번째 숫자가 큽니다":"두번째 숫자가큽니다";));
		
		System.out.println("더 큰 숫자는 " +d);
	}
}
