import java.util.Random;

public class GenerareRandom {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int intNr1 = rand.nextInt(10);
		int intNr2 = intNr1 *2;
		
		System.out.println(intNr1);
		System.out.println(intNr2);
		
		////////////
		Random randomGenerator = new Random();
		int randomNr = randomGenerator.nextInt(9); //[0,9]
		int doubleNr = randomNr*2;
		System.out.println(doubleNr);
			
		double doubleRandom = Math.random()*10;//[0,10)
		int intRandom = (int)(Math.random()*10);
		int doubleNumber = intRandom*2;
		System.out.println(doubleNumber);
	}

}