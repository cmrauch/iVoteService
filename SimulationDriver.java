import java.util.Scanner;
public class SimulationDriver {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		iVoteService vote = null;
		String question = "hello";
		Question q = null;
		char reply = 'y';
		boolean addChoice=false;
		
		//set the poll 
		System.out.println("Create a poll by entering your question\n");
		cin.next(question);
		System.out.println("Will you allow free response answers (y/n)? ");
		cin.nextByte(reply);
		q = vote.setQuestionType(q,reply); // q is now set to the appropriate sub class
		q.setQ(question);
		
		//configure the answers if necessary
		if(reply == 'y')
		{
		do {
		System.out.println("Possible Answer: ");
		cin.next(question);
		q.setA(question);
		
		System.out.println("Add Choice (y/n): ");
		cin.next(question);
		if(question=="y")
			addChoice = true;
		else
			addChoice = false;
		}while(addChoice);
		}
		
		
		//generate some students
		Student[] students = new Student[30];
		
		
		//submit answers to iVote Service
		for(int x = 0; x<30; ++x) {
			vote.SubmitAnswer(students[x]);
		}
		
		//call iVote Service output to display results
		vote.OutputStats(q);
}
}
