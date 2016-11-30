import java.util.ArrayList;
import java.util.Arrays;
public class Ex01 {
	public static void main(String args []) {
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println(numList);
		for (int i = 0; i < numList.size(); i++) {
			if (gFactor(numList.get(i)) == 0) {
				numList.remove(i);
			}
		}
		System.out.println("Composite numbers: " + numList);
	}
	public static int gFactor(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 1;
			}
		}
		return 0;
	}
}