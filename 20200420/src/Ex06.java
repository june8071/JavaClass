/*
 * 	�ڿ��� 1���� �����ؼ� ��� Ȧ���� ���� ������. 
 * 	�׸��� �� ���� ���� 1000�� �Ѿ����(���� ��������)
 * 	�׸��� 1000�� �Ѿ ���� �󸶰� �Ǵ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��غ���.
 */

public class Ex06 {
	public static void main(String[] args) {
		int a = 1;
		int total = 1;
		
		while(true) {
			
			a = a+2;
			total = total + a;
			
			
			if(total > 1000)
				break;
		}
		
		System.out.println("total = "+total);
		System.out.println("a = "+a);
	}
}
