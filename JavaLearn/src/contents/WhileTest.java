package contents;

public class WhileTest {
	public static void main(String[] args) {
		// 0~100������ ���� �� 5�� ����� �� ���ϱ�

		int i=5;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i+=5;
		}
		
		System.out.println(sum);
		
		//break�̿��� �ٸ� ����� �ִ�....
	}
}
