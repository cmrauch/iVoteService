// ==== iVoteService Class ====================================================
//
// ============================================================================
public class iVoteService {
	
// ==== chooseType ============================================================
	//output: returns a the type of a Question subclass. 
	//		  Determines whether the question is MultipleChoice
	//			or SingleChoice
	public Question chooseType(String input) {
		
		Question q;
		if(input.equalsIgnoreCase("yes")) {
			q = new MultipleChoice();
		}
		else {
			q = new SingleChoice();
		}
		return q;
		
	}//end of chooseType
// ============================================================================
	

// ==== setQuestion ===========================================================
	//input: arg1 - an instance of a Question subclass (polymorphism)
	//       arg2 - a string received from user, to be set as the question
	public void setQuestion(Question q, String question) {
		q.setQ(question);
		
	}// end of setQuestion
// ============================================================================


// ==== candidateAnswers ======================================================
	//input: arg1 - an instance of a Question subclass
	//		 arg2 - a candidate answer received from the user
	public void candidateAnswers(Question q, String choice) {
		q.addChoice(choice);
		
	}// end of candidateAnswers
// ============================================================================
	
	
// ==== getCandidateAnswers ===================================================
	//input:  arg1 - an instance of a Question subclass
	//ouptut: returns all of the candidate answers in the form of an array of
	//        strings
	public String[] getCandidateAnswers(Question q) {
		return q.getAns();
		
	}//end of getCandidateAnswers
// ============================================================================
	
	
// ==== addChoices ============================================================
	//input:  receives user input (should be "yes" or "no"
	//output: returns true if the user wants to add a candidate answer
	//        returns false otherwise
	public boolean addChoice(String choice) {
		if(choice.equalsIgnoreCase("yes")) 
			return true;
		else if(choice.equalsIgnoreCase("no"))
			return false;
		else
			System.out.println("invalid input");
		return false;
			
	}//end of addChoices
// ============================================================================
	
	
// ==== multipleChoice ========================================================	
	//output: returns true if the user keeps wanting to add choices
	public boolean multipleChoice(Question q){
		return q.addChoice();
		
	}// end of multipleChoice
// ============================================================================
	
	
// ==== displayResults ========================================================
	//output: displays the results
	//		  displays the candidate answer followed by how many students chose
	//		  chose that answer (student output is randomyl generated)
	public void displayResults(Question q,Student[] s) {	
		q.dispResult(s);
		
	}// end of displayResults
// ============================================================================
		
}// end of iVoteService
