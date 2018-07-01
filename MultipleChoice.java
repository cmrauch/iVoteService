public class MultipleChoice implements Question {

	public MultipleChoice() {
		int[] choices = {0};
		boolean answer[] = {false};
		numAns = 0;
		x = 0;
	}
	public void setQ(String question) {
			//sets the private data member question
			this.question = question;	
	}
	
	public void setA(String answer) {
		//sets the private data member answer
		//make sure argument is in scope
		this.answers[numAns++] = answer;
	}
	
	public void submit(int input) {
		//allows for many answer inputs
		++choices[input];		
}

	public int numAns() {
		return numAns;
	}
	
	public String getAnswer() {
		return answers[x++];
	}

	private String question;
	private String[] answers; 
	private int numAns;
	private int x;
	
  
  
  
  @Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int numChoices() {
		// TODO Auto-generated method stub
		return 0;
	}
}
