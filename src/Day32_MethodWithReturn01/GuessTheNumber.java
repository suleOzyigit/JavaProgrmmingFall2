package Day32_MethodWithReturn01;

import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		// play GuessNumComputerOnly()
		//PlayGuessNumLimit(int limit)
		//playGuessComputerVsMe(int secretNum)
		playGuessNumComputerOnly();
	}
	public static void playGuessNumComputerOnly() {
		Random random=new Random();
		int secretNumber=random.nextInt(21);
		int counter=0;
		do {
			counter++;
		System.out.println("guess the secret number");
		int guessNumber=random.nextInt(21);
		System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
		if(guessNumber==secretNumber ) {
			System.out.println("you won Guess the secret number is= " +secretNumber);
			break;
		}else {
			System.out.println("wrong try again");
		}
		}while(true);
	}

}
