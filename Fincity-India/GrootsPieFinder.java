import java.util.ArrayList;
import java.util.List;

public class GrootsPieFinder {
	public static List<Integer> findPies(int[] sweetnessValues, int desiredSweetness) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < sweetnessValues.length; i++) {
			if (sweetnessValues[i] == desiredSweetness) {
				result.add(i);
				return result;
			}
			for (int j = i + 1; j < sweetnessValues.length; j++) {
				if (sweetnessValues[j] == desiredSweetness) {
					result.add(j);
					return result;
				}
				if (sweetnessValues[i] + sweetnessValues[j] == desiredSweetness) {
					result.add(i);
					result.add(j);
					return result;
				}
				for (int k = j + 1; k < sweetnessValues.length; k++) {
					if (sweetnessValues[k] == desiredSweetness) {
						result.add(k);
						return result;
					}
					if (sweetnessValues[j] + sweetnessValues[k] == desiredSweetness) {
						result.add(j);
						result.add(k);
						return result;
					}
					if (sweetnessValues[i] + sweetnessValues[j] + sweetnessValues[k] == desiredSweetness) {
						result.add(i);
						result.add(j);
						result.add(k);
						return result;
					}
				}
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[] sweetnessValues = { 8, 4, 3, 2, 6, 5 };
		int desiredSweetness = 6;

		List<Integer> piesToConsume = findPies(sweetnessValues, desiredSweetness);

		System.out.println(piesToConsume);
	}
}
