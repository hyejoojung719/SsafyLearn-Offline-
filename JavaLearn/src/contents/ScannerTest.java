package contents;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// �Է°��� ������ �������� ��.
		System.setIn(new FileInputStream("src/test2/input.txt"));
		Scanner sc = new Scanner(System.in);
		/*
		// ���ڿ� �Է�
		String str = sc.next();
		System.out.println(str);
		
		// ���� �Է�
		int a = sc.nextInt();
		System.out.println(a);
		
		// ���� �Է�
		char b = sc.next().charAt(0);
		System.out.println(b);
		
		// �� �� �Է�
		String str1 = sc.nextLine();
		System.out.println(str1);
		*/
		sc.close();
		
		
	}

}
