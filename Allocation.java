package learning;

import java.util.*;

public class Testing {
	
	public static final Scanner input = new Scanner (System.in);
	
	public static int solve() {
		int numberOfHouses = input.nextInt();
		int priceHave = input.nextInt();
		input.nextLine();
		int[] stringArray = new int[numberOfHouses];
		for (int i = 0; i < numberOfHouses; i++)
            stringArray[i] = input.nextInt();
		Arrays.sort(stringArray);
		int sum = 0;
		int result = 0;
		for (int i = 0; i <= stringArray.length - 1; i++) {
			if (sum + stringArray[i] > priceHave) {
				continue;
			}
			sum += stringArray[i];
			++result;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int testCases = input.nextInt();
    	for (int i = 1; i <= testCases; i++) {
    		System.out.println("Case #" + i + ": " + solve());
    	}
    }
}
