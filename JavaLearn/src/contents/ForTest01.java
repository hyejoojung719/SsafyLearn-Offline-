package contents;

public class ForTest01 {
	public static void main(String[] args) {
		// 1~100 ������ ���� �� 4�� ����� ���� ���ϱ�
		
		int sum = 0;
		
		// for(1. �ʱ�ȭ; 2. ���ǽ�; 4. ����){
		//	3. ����
		//}
		for(int i=1; i<=100; i++) {
			if(i%4 == 0) sum += i;
		}
		System.out.println(sum);
		
		/*  �ӵ��� �� ���� ���
		 for(int i=4; i<=100; i+=4){
		 	sum+=i; 
		 }
		  */
	}
}
