// ==== Question Interface ====================================================
//
// ============================================================================

public interface Question {
	
	// receives user input and sets the correct question
	public void setQ(String q);
	
	//displays the question
	public void dispQ();//same in both
	
	//returns the number of candidate answers
	public int getNumAns();//only in MultipleChoice
	
	//adds a candidate answer
	public void addChoice(String choice);//only in MultipleChoice
	
	//determines if the user wants to add a candidate answer
	public boolean addChoice();
	
	//returns the candidate answers... which are in an array of strings
	public String[] getAns();//only used in randomizing students
	
	//displays the result of each student
	public void dispResult(Student[] s);
	
	
}

