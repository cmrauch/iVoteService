import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
	
	Student(){
		//randomize their id's and answers
		this.id = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 5);
		this.answer = "A";
	}
	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}
	
	public String generateRandomAns(int numAns) {
		return generateRandomChars("AB", 1);
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	private String id;
	private String answer;
	
}
