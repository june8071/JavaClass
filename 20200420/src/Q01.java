/*
 * 	구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을 작성하되 
 * 	2단의 2X2, 4단은 4X4, 6단은 6X6, 8단은 8X8까지 출력하도록 작성하자.
 */
public class Q01 {
	public static void main(String[] args) {
		
		for(int num = 2 ; num<9 ; num++) {
			if(num%2 == 1) {
				num++;
			}
			for(int dan = 1 ; dan < (num+1) ; dan++) {
				System.out.println(num + "X"+ dan+ "="+(num*dan) );
			}
			if(num == 8)
				break;
		}
	}
}
