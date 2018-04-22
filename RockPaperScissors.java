/**
 @Title: RockPaperScissors
 @Purpose: To get familiar with methods in Java
 @Author: Zamzow, Avery
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args){
		String computer,choice;
		boolean valid;
	
		Scanner sc = new Scanner(System.in);
		do{
		computer= computerChoice();
		choice = userChoice();
		valid = isValidChoice(choice);

		System.out.println("The computer chose = "+computer);
		System.out.println("You chose = "+choice);
		if(valid)
		{
			determineWinner(computer,choice);
		}
		}
		while(computer.equalsIgnoreCase(choice) || valid == false);
		
	}// end of main method

	/**
	computerChoice method
	@return The computer's choice of "rock“, ”paper", or "scissors".
	*/
	public static String computerChoice(){
		Random rand = new Random();
		int randomNumber = rand.nextInt(3) + 1;
		if ( randomNumber == 1){
			return "Rock";
		}
		else if ( randomNumber == 2) {
			return "Paper";
		}
		else if(randomNumber == 3){
			return "Scissors";
		}
		else
		{
			return null;
		}
	}// end of computerChoice method

	/**
	userChoice method
	@return The user's choice of "rock", "paper", or "scissors".
	*/
	public static String userChoice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Make your guess, 'rock', 'paper', 'scissors'. ");
		
		String input = sc.nextLine();
		
		return input;
		
	}// end of userChoice method

	/**
	isValidChoice method
	@param choice A string holding the user's choice.
	@return true if the choice is valid, false otherwise.
	*/
	public static boolean isValidChoice(String choice){
		System.out.println(choice);
		if (choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors")) {
			//System.out.println("Valid");
			return true;
			
		}
		else {
			System.out.println("Not a Valid input please try again");
			return false;
		}
	}// end of isValidChoice method

	/**
	The determineWinner method displays the winner.
	@param computer The computer's choice.
	@param user The user's choice.
	*/
	public static void determineWinner(String computer, String choice){
		if (computer.equalsIgnoreCase("Rock")) {
			if(choice.equalsIgnoreCase("Scissors")){
				System.out.println("Rock wins");
			}
			else if(choice.equalsIgnoreCase("Paper")){
				System.out.println("Paper wins");
			}
		}
		else if (computer.equalsIgnoreCase("Scissors")){
			if(choice.equalsIgnoreCase("Rock")){
				System.out.println("Rock wins");
			}
			else if(choice.equalsIgnoreCase("Paper")){
				System.out.println("Scissors wins");
			}
		}
		else if(computer.equalsIgnoreCase("Paper")){
			if(choice.equalsIgnoreCase("Rock")){
				System.out.println("Paper wins");
			}
			else if(choice.equalsIgnoreCase("Scissors")){
				System.out.println("Scissors wins");
			}
		}
		else if(computer.equalsIgnoreCase(choice)){
			System.out.println("Please repeat the process");
		}
	// end of determineWinner
	}
} // end of public class
