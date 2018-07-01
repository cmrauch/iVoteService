
public class iVoteService {
	
	iVoteService(){
		this.current=0;
	}//constructor for initialization
	
	//public void addCandidateAnswer(String answer) {
	//	candidateAns[current] = answer;//add an answer to the list of candidate answers
	//}
	
	//returns correct type
	public Question setQuestionType(Question question, char reply) {
		if(reply == 'y')
		{
		SingleChoice x = null;
		question = x;
		}
		else
		{
			MultipleChoice y = null;
			question = y;
		}
		return question;
		
	}//returns the correct subclass
	
	public void SubmitAnswer(Student s) {
		answers[current] = s.getAnswer();
	}
	
	public void OutputStats(Question q) {
		int y = 0;
		while(q.numAns()>y) {
		int counter = 0;
		String output = q.getAnswer();
		
		for(int x = 0;x<this.current;++x) {
			if(answers[x] == output)
				++counter;
		}
		
		System.out.print(output);
		System.out.print(" : ");
		System.out.print(counter);
	}
	}
	public void SetCorrectAnswer() {
		
	}
	
	public void setQuestion(Question qType, String question) {
		qType.setQ(question);
	}
	
/*	public void configureAnswers(Question qType) {
		qType.setA();
	}
	*/
	
	private String[] answers;
	//private String[] submissions;
	//private boolean freeResponse;
	//private int correctAnswer;
	private int current;
}
