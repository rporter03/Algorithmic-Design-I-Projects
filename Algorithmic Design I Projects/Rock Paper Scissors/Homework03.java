import java.util.Scanner;
import java.util.Random;
public class Homework03 {
	
	public static void main(String[] args) {

		// Robert Porter
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// declare scores & round
		int playerScore;
		int computerScore;
		int round;
		
		// rps array
		String[] rps = {"rock", "paper", "scissors"};
		
		System.out.println("Let's play Rock Paper Scissors! The best of 3 wins.");
		
		// begin loop here while keepPlaying == "yes"
		String keepPlaying = "";
		do 
		{
			
			// reset scores & round
			playerScore = 0;
			computerScore = 0;
			round = 0;
			
			do
			{
				
				System.out.println("Enter your move (enter rock, paper, or scissors): ");
				
				// storing player move and creating random computer move
				String playerMove = input.next();
				String computerMove = rps[random.nextInt(rps.length)];
			
				// outcomes
				if(playerMove.equals(computerMove))
				{
					System.out.println("It's a tie! The computer chose " +computerMove +"!");
				}
				
				else if(!playerMove.equals(computerMove))
				{
					
					// player victories
					if(playerMove.equalsIgnoreCase("rock") && (computerMove.equals("scissors")))
					{
						System.out.println("The computer chose " +computerMove +". You gained a point!");
						playerScore = playerScore + 1;
					}
					
					else if(playerMove.equalsIgnoreCase("scissors") && (computerMove.equals("paper")))
					{
						System.out.println("The computer chose " +computerMove +". You gained a point!");
						playerScore = playerScore + 1;
					}
					
					else if(playerMove.equalsIgnoreCase("paper") && (computerMove.equals("rock")))
					{
						System.out.println("The computer chose " +computerMove +". You gained a point!");
						playerScore = playerScore + 1;
					}
							
					// computer victories
					else if(computerMove.equals("rock") && (playerMove.equalsIgnoreCase("scissors")))
					{
						System.out.println("The computer chose " +computerMove +". The computer gained a point!");
						computerScore = computerScore + 1;
					}
					
					else if(computerMove.equals("scissors") && (playerMove.equalsIgnoreCase("paper")))
					{
						System.out.println("The computer chose " +computerMove +". The computer gained a point!");
						computerScore = computerScore + 1;
					}
					
					else if(computerMove.equals("paper") && (playerMove.equalsIgnoreCase("rock")))
					{
						System.out.println("The computer chose " +computerMove +". The computer gained a point!");
						computerScore = computerScore + 1;
					}
					
					// computer gains a point for invalid input from player
					else if(!playerMove.equalsIgnoreCase("rock") && (!playerMove.equalsIgnoreCase("paper") && (!playerMove.equalsIgnoreCase("scissors"))))
					{
						System.out.println("Invalid input! The computer gained a point!");
						computerScore = computerScore + 1;
					}
				}
			round = round + 1;
			}while(round < 3);
			
			// final victories
			if(playerScore > computerScore)
			{
				System.out.println("You win! You scored " +playerScore +" points and the computer scored " +computerScore +" points!");
			}
			
			else if(playerScore < computerScore)
			{
				System.out.println("You lose! You scored " +playerScore +" points and the computer scored " +computerScore +" points!");
			}
			
			else
			{
				System.out.println("It's a tie! You and the computer both scored " +playerScore +" points!");
			}
		
		// ask user if they want to keep playing. if no, break out of loop and end program
		System.out.println("Do you want to keep playing? Enter 'yes' or 'no.' ");
		keepPlaying = input.next();
		}while(keepPlaying.equalsIgnoreCase("yes"));
		
		System.err.println("Exiting program...");
		System.exit(0);
	}
}
