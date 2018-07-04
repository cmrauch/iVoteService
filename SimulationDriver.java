// ==== Main ==================================================================
//
// ============================================================================

import java.util.Scanner;
public class SimulationDriver {

	public static void main(String args[]) {
		
		//data declarations
		Scanner reader = new Scanner(System.in);
		iVoteService vote = new iVoteService();
		Question q;//abstract type
		String input;
		String add;
		
		//prompt the user
		System.out.println("Allow multiple inputs? ");
		input = reader.next();
		q = vote.chooseType(input);
		System.out.println("What is the question? ");//promt user for question
		reader.nextLine();
		input = reader.nextLine();
		vote.setQuestion(q,input);

		
		//if the question is multiple choice then prompt the user for multiple submissions
		//otherwise this step is skipped
		if(vote.multipleChoice(q)) {
	    	//loop to receive multiple user inputs
			do {
				System.out.println("Add Choice ");//promt user for input
				input = reader.nextLine();
				vote.candidateAnswers(q,input);
				System.out.println("Add Choice? (yes/no) ");//promt user for input
				add = reader.next();
				reader.nextLine();
			}while(vote.addChoice(add));		
		}
		
		
		//generate the students and randomize answers/id's
		System.out.println("Generating Students and Answers.... ");
		Student s[] = new Student[100];
		for(int i=0;i<s.length;++i) 
			s[i] = new Student(vote.getCandidateAnswers(q),q.getNumAns());
		
		
		//display the results
		vote.displayResults(q,s); 
		
		reader.close();
	}//end of main
}

