//This class handles all user input and random numbers
import java.util.Random;
public class Answers {
	Random rand = new Random();
	String answer;
	//Checks if the user asked a question or not
	//Makes a random number to decide which answer then returns the answer depending on the mood condition
	public void positiveAnswer() {
		int rand2 = rand.nextInt(10);
		if(rand2==0) {
			answer="It is certain.";
			System.out.print(answer);
		}
		else if(rand2==1) {
			answer="It is decidedly so.";
			System.out.print(answer);
		}
		else if(rand2==2) {
			answer="Without a doubt.";
			System.out.print(answer);
		}
		else if(rand2==3) {
			answer="Yes definitely.";
			System.out.print(answer);
		}
		else if(rand2==4) {
			answer="You may rely on it.";
			System.out.print(answer);
		}
		else if(rand2==5) {
			answer="As I see it, yes.";
			System.out.print(answer);
		}
		else if(rand2==6) {
			answer="Most likely.";
			System.out.print(answer);
		}
		else if(rand2==7) {
			answer="Outlook good.";
			System.out.print(answer);
		}
		else if(rand2==8) {
			answer="Yes.";
			System.out.print(answer);
		}
		else if(rand2==9) {
			answer="Signs point to yes.";
			System.out.print(answer);
		}
	}
	public void nonCommitAnswer() {
		int rand2 = rand.nextInt(5);
		if(rand2==0) {
			answer="Reply hazy, try again.";
			System.out.print(answer);
		}
		else if(rand2==1) {
			answer="Ask again later.";
			System.out.print(answer);
		}
		else if(rand2==2) {
			answer="Better not tell you now.";
			System.out.print(answer);
		}
		else if(rand2==3) {
			answer="Cannot predict now.";
			System.out.print(answer);
		}
		else if(rand2==4) {
			answer="Concentrate and ask again.";
			System.out.print(answer);
		}
	}
	public void negativeAnswer() {
		int rand2 = rand.nextInt(5);
		if(rand2==0) {
			answer="Reply hazy, try again.";
			System.out.print(answer);
		}
		else if(rand2==1) {
			answer="Ask again later.";
			System.out.print(answer);
		}
		else if(rand2==2) {
			answer="Better not tell you now.";
			System.out.print(answer);
		}
		else if(rand2==3) {
			answer="Cannot predict now.";
			System.out.print(answer);
		}
		else if(rand2==4) {
			answer="Concentrate and ask again.";
			System.out.print(answer);
		}
	}
	
	
}
