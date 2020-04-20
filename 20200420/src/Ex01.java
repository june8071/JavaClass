import java.util.Scanner;

/*	cmd창에서 javac로 컴파일 하는 것
 * 
 *  컴파일 : javac Ex01.java  = > Ex01.class 파일 생성
 *  실행 : java Ex01  
 * 
 * 이클립스로 사용하기때문에 자동 컴파일이 된다.
 * 
 * debug모드. 이클립스모드에서만 사용되는 개발자 도구
 * f6 한 라인씩 진행
 * f8 디버그 모드 종료 or 다음 브레이크 포인트까지 진행
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
		System.out.println("입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		System.out.println("inputValue = "+inputValue);
		
	}
}
