package contents;
import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		
		// 1���� �迭 ����
		int[] arr = new int[6];
		System.out.println(arr[0]);
		//  �迭�� �ʱ�ȭ�� ���ϸ� �ڵ����� 0����
		
		
		// ����� �ʱ�ȭ �ѹ��� ó��
		
		// ���1
		int[] arr2 = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
		
		// ���2
		// new int[]�� ����ÿ��� ���� ����
		int[] arr3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr3));
		/* �̰Ŵ� �� ��
		int[] arr4;
		arr4 = {1,2,3,4,5}; 
		*/
		
		// ���3
		int[] arr4;
		arr4 = new int[] {1,2,3,4,5};
		
		/* for�� �̿��ؼ� ���
		for(int idx=0; idx<4; idx++) {
			System.out.println(arr[idx]);
		}*/
		
		// for-each�� �̿��ؼ� ���
		// for(�迭�� ��� : �迭)
		for(int x : arr4) System.out.println(x);
		// for-each �� ���� �� ����x(���� ���� ���� ���� ��� readonly)
		
	
		
		
	}
}
