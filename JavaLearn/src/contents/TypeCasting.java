package contents;

public class TypeCasting {
	public static void main(String[] args) {
		  
		//�ڵ� �� ��ȯ(������ ����ȯ)
		int a = 'A';	//65
		System.out.println(a);
		
		int b = 'a';	//97
		System.out.println(b);
		
		int c = '0';	//48
		System.out.println(c);
		
		// ����� ����ȯ
		int number = 260;
		
		byte number2 = (byte)number;
		System.out.println(number2); //��Ʈ�� ������ ����� �ƹ� ���� ����
	}
}
