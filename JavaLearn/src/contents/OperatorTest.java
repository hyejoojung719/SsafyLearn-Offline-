package contents;

public class OperatorTest {
	public static void main(String[] args) {
		int num = 10;
		
		//++num; 	// num ���� �� �ٸ� ���� ����
		//num++;	// �ٸ� ���� ���� �� num�� ���� 
		
		if(num-- <10 /*--num < 10*/) {
			System.out.println(" ������ true");
		}
		System.out.println(num);
		
		/*
		// &�̶� &&����
		// & : �� ���������� ��Ʈ ������. ������ ���մϴ�.(�� ������ false�� �ڿ� ���� ����, �� �Ѵ� true���� true)
		// && : ���ʺ��� �Ǵ�(������ false�� &&�ڿ��� ����x)
		if(num < 10 && num++ > 5) {
			System.out.println(" ������ true ");
		}
		System.out.println(num);
		*/
		
		if(true || num++>10) {
			// ������ true�� �ڿ��� ����x(or����)
		}
		
		//���� ������
		int a = 10;
		String b;
		
		/*
		if(a%2==0) b="¦��";
		else b="Ȧ��";
		*/
		
		// �ٸ� ǥ�� ���
		// ���Թ��� ���� = ���ǽ�  ? ���� �� ������ �� : ������ �� ������ ��
		b = a%2==0?"¦��":"Ȧ��";
		System.out.println(b); 
		
		
		char c = 'A';
		//System.out.println(c+1);	//66
		System.out.println(++c);	//B //���꺸�� ��Ʈ�� ���� �ٲٴ°� ������
		
	}
}
