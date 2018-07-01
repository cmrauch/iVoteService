import java.awt.List;
import java.util.ArrayList;

public class iVoteService {
	
	iVoteService(){
		//answers = new String[100];
		this.current=0;
	}//constructor for initialization
	

	public void SubmitAnswer(Student s) {
		answers.add(s.getAnswer());
	}
	
	public void OutputStats(Question q) {
		int y = 0;
		while(q.numAns()>y) {
		int counter = 0;
		String output = q.getAnswer();
		
		for(int x = 0;x<this.current;++x) {
			if(answers.get(x) == output)
				++counter;
		}
		
		System.out.print(output);
		System.out.print(" : ");
		System.out.print(counter);
	}
	}

	
	public void setQuestion(Question qType, String question) {
		qType.setQ(question);
	}
	

	 ArrayList<String> answers = new ArrayList<String>();
	//private String[] answers = new String[100];
	private int current;
}
