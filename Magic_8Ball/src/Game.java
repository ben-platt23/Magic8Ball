/**
 * @author Ben Platt
 * @date 10/20/2021
 **/
import java.util.Random;
import java.util.Scanner;
//This class simulates the "game"
public class Game {
	
	String NewQ;
	String answer;
	Answers i = new Answers();
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//creating objects
		Game g = new Game();
		//calling the menu of the game
		g.menu();
	}
//Where the user inputs their question
	public void menu() {
		System.out.println("Ask me a question!");
		NewQ = input.nextLine();
		setQ(NewQ);
		if(isQuestion()==true) {
			int rand1 = rand.nextInt(3);
			if(rand1==0) {
				i.positiveAnswer();
				System.out.println();
			}
			if(rand1==1) {
				i.nonCommitAnswer();
				System.out.println();
			}
			if(rand1==2) {
				i.negativeAnswer();
			}	
		}
	}
	public boolean isQuestion() {
		getQ();
		int length = NewQ.length();
		char result = NewQ.charAt(length-1);
		if(result != '?') {
			System.out.println("That's not a question");
			return false;
		}
		else {
			return true;
		}
	}
	//Getters and setters
	public void setQ(String Q) {
		this.NewQ = Q;
	}
	public String getQ() {
		return NewQ;
	}
}
