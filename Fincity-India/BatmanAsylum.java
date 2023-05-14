public class BatmanAsylum {
	public static int calculateSteps(int numOfPatients, int stepOfFirstPatient) {
		int totalSteps = 0;

		// Calculate the steps required to tag each patient
		for (int i = 0; i < numOfPatients; i++) {
			totalSteps += stepOfFirstPatient * i;
		}

		return totalSteps;
	}

	public static void main(String[] args) {
		int numOfPatients = 3;
		int stepOfFirstPatient = 10;

		int totalSteps = calculateSteps(numOfPatients, stepOfFirstPatient);
		System.out.println("Total steps required: " + totalSteps);
	}
}

/*
 * 
 * steps =10
 * 
 * p1 = asylum + 10 p2 = asylum + 20 p3 = asylum + 30
 */
