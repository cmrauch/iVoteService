public class SingleChoice implements Question{

	public SingleChoice() {
		numVotes = 0;
		question = null;
		submission = null;
	}
	public void setQ(String question) {
		//sets the private data member question
		this.question = question;
	}
	
	public void setA(String answer) {
		//sets the private data member answer
	}
	
	public void submit(String submission) {
		//allows for a single answer input
		this.submission[numVotes] = submission;
		++numVotes;
	}
	
	private String question;
	private String[] submission; //contains all the submitted answers
	private int numVotes; //number of submissions
	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int numChoices() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int numAns() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
