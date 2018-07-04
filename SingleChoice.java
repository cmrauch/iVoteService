
public class SingleChoice implements Question{


	
	public void setQ(String question) {
		this.myQ = question;
	}
	
	public void dispQ() {
		System.out.println(myQ);
	}
		
	public boolean addChoice() {
		return false;
	}
	
	public void dispResult(Student[] s) {
		this.dispQ();
		for(int i = 0; i<s.length; ++i) {
			System.out.println(s[i].getAnswer());
		}
		
	}
	
	public void addChoice(String ans) {
		
	}//never used
	
	public int getNumAns() {
		return 0;
	}//not really
	
	public String[] getAns() {
		return null;
	}//not really	
	
	private String myQ;

}
