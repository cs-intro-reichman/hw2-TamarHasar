// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int numSequences = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int firstSeedCount = 1; 
		int counter = 0;

		if (mode.equals("v")){
			for (int i = 0; i < numSequences; i++){
				seed = firstSeedCount; 
				counter = 0;
				
				System.out.print(seed + " ");
				counter ++;

				if (seed == 1){
					seed = seed * 3 + 1;
					System.out.print(seed + " ");
					counter ++;
				}

		
				while (seed != 1) {
					if (seed % 2 == 0){
						seed = seed / 2;
					}
					else if (seed % 2 == 1){
						seed = seed * 3 + 1;
					}
					System.out.print(seed + " ");
					counter ++;
				}
				System.out.println("(" + counter + ")");
				firstSeedCount += 1;
			}
			
			System.out.println("Every one of the first " + numSequences +" hailstone sequences reached 1");

		}

		else if (mode.equals("c")){
			System.out.println("Every one of the first " + numSequences +" hailstone sequences reached 1");
		}
	}
}
