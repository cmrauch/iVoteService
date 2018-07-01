import java.util.Scanner;
public class SimulationDriver {

	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		iVoteService vote = new iVoteService();
		String question = "hello";
		String reply = "y";
		boolean addChoice=false;
		
		//set the poll 
		System.out.println("Create a poll by entering your question\n");
		question = cin.next();
		System.out.println("Will you allow free response answers (y/n)? ");
	        reply = cin.next();
	    
	    //use the correct subclass 
	    //instantiate a SingleChoice class if the user entered yes
	    if(reply == "y") {
	    	SingleChoice q = new SingleChoice();
		    
	    	//receive input from user and set the question
	    	q.setQ(question);
	    }
	    else if(reply =="n") {
	    	MultipleChoice q = new MultipleChoice();
	    	q.setQ(question);
		    
		//add possible answers
		//they are to be stored in an array
	    	do {
	    		System.out.println("Possible Answer: ");
	    		cin.next(question);
	    		q.setA(question);
	    		//----------------------------------------------------
	    		System.out.println("Add Choice (y/n): ");
	    		cin.next(question);
	    		if(question=="y") {
	    			addChoice = true;
	    		}
	    		else {
	    			addChoice = false;
	    		}
	    		}while(addChoice);
	    	
	    }
	   
		//generate some students
    	Student[] students = new Student[30];
    	
    	//submit answers to iVote Service
    	for(int x = 0; x<30; ++x) {
			vote.SubmitAnswer(students[x]);
		}
    	
    	//display stats
    	vote.OutputStats(q);
		
    	
    	
    	
    	
    	
    	
    	
  /*  	
    	q = vote.setQuestionType(q,reply); // q is now set to the appropriate sub class
		q.setQ(question);
		
		configure the answers if necessary
		
		
		
		generate some students
		Student[] students = new Student[30];
		
		
		submit answers to iVote Service
		for(int x = 0; x<30; ++x) {
			vote.SubmitAnswer(students[x]);
		}
*/		
		//call iVote Service output to display results
		//vote.OutputStats(q);
}
}
