/*
 * 	�������� ¦�� ���� 2,4,6,8�ܸ� ����ϴ� ���α׷��� �ۼ��ϵ� 
 * 	2���� 2X2, 4���� 4X4, 6���� 6X6, 8���� 8X8���� ����ϵ��� �ۼ�����.
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
