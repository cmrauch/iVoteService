public interface Question {
	
	
	Student[] numAns = null;

	public void setQ(String question);
	
	public void setA(String answer);
	
	public void submit();
	
	public int numChoices();
	
	public String getAnswer();
	
	public int numAns();
	}
