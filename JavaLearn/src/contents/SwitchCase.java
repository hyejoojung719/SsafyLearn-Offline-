package contents;

public class SwitchCase {
	public static void main(String[] args) {
		int score = (int)(Math.random()*6)+1;
		
		// Math.random() : 0<= ? <1
		// ���⿡ 6�� ���ϸ� : 0<= ? <6 
		// ���⿡ 1�� ���ϸ� : 1<= ? <7
		
		switch(score) {
		case 1 :
			System.out.println("1�Դϴ�.");
			break;
		case 2 : 
			System.out.println("2�Դϴ�.");
			break;
		case 3 :
			System.out.println("3�Դϴ�.");
			break;
		case 4 :
			System.out.println("4�Դϴ�.");
			break;
		case 5 :
			System.out.println("5�Դϴ�.");
			break;
		default :
			System.out.println("6�Դϴ�.");
			break;
		}
		
	}
}
