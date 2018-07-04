
public class MultipleChoice implements Question{
	
// ==== Constructor ===========================================================
	MultipleChoice(){
		myChoices = new String[100];
		numChoices = 0;
	}
//=============================================================================

// ==== setQ ==================================================================
	//input: arg1 - receives a string from the user, sets it as the question
	public void setQ(String question) {
		this.myQ = question;
	}
// ============================================================================

// ==== getAns ================================================================
	public String[] getAns(){
		return myChoices;
	}
// ============================================================================
	
// ==== getNumAns =============================================================
	public int getNumAns() {
		return this.numChoices;
	}
// ============================================================================
	
// ==== dispQ =================================================================	
	public void dispQ() {
		System.out.println(myQ);
	}
// ============================================================================
	
// ==== addChoice =============================================================
	public void addChoice(String ans) {
		this.myChoices[this.numChoices] = ans.intern();
		++numChoices;
	}
// ============================================================================
	
// ==== addChoice =============================================================
	public boolean addChoice() {
		return true;
	}
// ============================================================================
	
// ==== dispResult ============================================================	
	public void dispResult(Student[] s) {
		String[] answers = this.getAns();
		int counter = 0;
		
		this.dispQ();
		for(int i = 0;i<this.getNumAns();++i) {
			System.out.print(answers[i]);
			System.out.print(": ");
			counter = 0;
			for(int x = 0; x<s.length;++x) {
				String sAnswer = s[x].getAnswer();
				String oAnswer = answers[i];
				
				if(sAnswer.intern() == oAnswer.intern()) {
					++counter;
				}
			}
			System.out.print(counter);
			System.out.print("\n");
		}	
	}
// ============================================================================
	
// ==== Data Variables ========================================================
	private String myQ;
	private String[] myChoices;
	private int numChoices;
}