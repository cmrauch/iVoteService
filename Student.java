// ==== Student Class =========================================================
//
// ============================================================================

import java.util.Random;

public class Student {
	
// ==== Constructor ===========================================================	
	//input: arg1 - all the candidate answers. This is used to randomize 
	//              answers
	//		 arg2 - the number of candidate answers. Used as a range for the 
	//              the randomized answers
	Student(String[] answers, int numAns){
		//randomize id's
		this.id = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 5);
		
		//randomize answers
		if((numAns != 0) && (answers != null))
			this.answer = generateRandomAns(answers,numAns);
		else {
			Random r = new Random();
			int randomValue = r.nextInt(25);
			this.answer = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ",randomValue);
		}
	}// end of constructor
//=============================================================================
	
	
//==== GenerateRandomChars ====================================================	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }
	    return sb.toString();
	}// end of GenerateRandomChars
//=============================================================================
	
	
//==== GenerateRandomAns ======================================================
	public static String generateRandomAns(String[] ans, int numAns) {	
		Random r = new Random();
		int randomValue = r.nextInt(numAns);
		return ans[randomValue];
	}//end of generateRandomAns
//=============================================================================
	
	
//==== getID ==================================================================
	//output: returns the students id
	public String getID() {
		return this.id;
	}
//=============================================================================
	
	
//==== getAnswer ==============================================================	
	//output: returns the student's answer
	public String getAnswer() {
		return this.answer.intern();
	}
//=============================================================================
	
	
//===Data Members =============================================================
	private String id;
	private String answer;
	
}
