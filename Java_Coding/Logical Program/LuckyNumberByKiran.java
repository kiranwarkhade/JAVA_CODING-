
public class LuckyNumberByKiran {

	public static void main(String[] args) {
		
		int last =4;
		luckyNumberSequesnce(last);
		luckyNumberInArray(new int[]{5,5,6});
	}

	private static void luckyNumberSequesnce(int last) {
		int sum = 0;
		for (int i = 1; i <= last; i++) {
			sum = sum + i;
		}

		int rem = sum % 10;
		int div = sum / 10;
		int luckyNumber = div + rem;
		System.out.println(luckyNumber);
	}

	private static void luckyNumberInArray(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum = sum + i;
		}

		int rem = sum % 10;
		int div = sum / 10;
		int luckyNumber = div + rem;
		System.out.println(luckyNumber);
	}
	
}
