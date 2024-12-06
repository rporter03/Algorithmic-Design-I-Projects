import java.util.Scanner;
import java.util.Random;
public class Homework02 {

	// Robert Porter
	
	public static final int MAX = 11;
	public static final int USC = 85;
	public static final int FLORIDA = 85;
	public static final int FOOTBALL_FOOD = 4;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// football branch variables
		int markusNum = random.nextInt(MAX);
		int uscScore = random.nextInt(USC);
		int floridaScore = random.nextInt(FLORIDA);
		int fbFoodRiley = random.nextInt(FOOTBALL_FOOD);
		int fbFoodMarkus = random.nextInt(FOOTBALL_FOOD);
		boolean numGuess = false;
		boolean uscFan = false;
		boolean uscWin = false;
		boolean floridaFan = false;
		boolean floridaWin = false;
		String food = "";
		String teamInput = "";
		String fbFoodR = ""; 				// correlates to int fbFoodRiley	(fb stands for football)
		String fbFoodM = "";				// correlates to int fbFoodMarkus
		String zaxbys = "";
		String sonic = "";
		
		// creating random instances of what food choice Markus and Riley will get from the concession stands in the football branch
		switch(fbFoodRiley) 
		{
		case 0:
			fbFoodR = "pizza";
			break;
		case 1:
			fbFoodR = "hot dogs";
			break;
		case 2:
			fbFoodR = "chicken tenders";
			break;
		case 3:
			fbFoodR = "nachos";
			break;
		default: System.err.println("Error!");
		}
		
		switch(fbFoodMarkus) 
		{
		case 0:
			fbFoodM = "pizza";
			break;
		case 1:
			fbFoodM = "hot dogs";
			break;
		case 2:
			fbFoodM = "chicken tenders";
			break;
		case 3:
			fbFoodM = "nachos";
			break;
		default: System.err.println("Error!");
		}
		
		// introduction
		System.out.println("It's Saturday and you're hanging out with your friend Riley. "
				+ "You both want to do something, but you're both stumped at what you want to do. ");
		System.out.println("You guys narrow it down to either going to a football game or going to the beach. ");
		System.out.println("Pick where you guys are going. (Enter 'football' or 'beach'): ");
		String response = input.next();
		
		//========== football branch ==========\\
		if(response.equalsIgnoreCase("football"))
		{
			System.out.println("You and Riley both decide to go to the USC football game. ");
			System.out.println("While both of you are getting ready to leave, your friend Markus calls you to see what's up.");
			System.out.println("Do you invite Markus to come with you and Riley to the game? Enter 'yes' or 'no': ");
			String invite = input.next();
			
			// markus invited branch
			if(invite.equalsIgnoreCase("yes")) 
			{
				System.out.println("You and Riley decide to invite Markus to go to the game. ");
				System.out.println("Markus comes over and all of you leave together so you can get to the game on time. ");
				System.out.println("On the way there, Markus asks you to pick any number up to 10. What number do you pick? ");
				int guess = input.nextInt();
				
				if(guess != markusNum)
				{
					System.out.println("That's the wrong number! Markus' number was " +markusNum +"!");
				}
				
				else if(guess == markusNum)
				{
					System.out.println("Wow! You guessed the correct number! Markus and Riley applaud you.");
					numGuess = true;
				}
				
				// input error fix
				input.nextLine();
				
				System.out.println("After an hour of driving, you guys finally make it to the game! ");
				System.out.println("It's going to be USC vs. the Univeristy of Florida! "
						+ "Who are you cheering for? Enter 'USC' or 'Florida.' ");
				teamInput = input.nextLine();
				
				// if team = usc, set uscFan = true
				if(teamInput.equalsIgnoreCase("USC"))
				{
					uscFan = true;
					System.out.println("You tell Riley and Markus that you're cheering for USC. Riley cheers in excitement "
							+ "upon hearing this because he loves USC.");
					System.out.println("You guys are now sitting in the stands as the game starts! Go Cocks! ");
				}
				
				// if team = florida, set floridaFan = true
				else if(teamInput.equalsIgnoreCase("Florida"))
				{
					floridaFan = true;
					System.out.println("You tell Riley and Markus that you hope Florida wins. Riley gives you a "
							+ "disappointing glance since he is the BIGGEST fan of USC. ");
					System.out.println("Thus begins a rivalry between you and Riley.");
					System.out.println("You, Markus, and Riley all sit in the stands as the game begins! ");
					System.out.println("Riley then yells \"GO COCKS\" at the top of his lungs to show you his excitement "
							+ "and passion. ");
				}
				
				System.out.println("A little time passes and it's now half-time. "
						+ "Everyone is hungry so you all decide to go to the concession stands. ");
				System.out.println("Riley tells you they have pizza, hot dogs, chicken tenders, and some nachos. What do you want to eat?");
				food = input.nextLine();
				
				if(fbFoodR == fbFoodM)
				{
					System.out.println("While you decided to have " +food +", both Riley and Markus got " +fbFoodR);
				}
				
				else
				{
					System.out.println("You decided to get " +food +" from the concession stand. ");
					System.out.println("Riley got " +fbFoodR +" and Markus decided to get " +fbFoodM +".");
				}
				
				System.out.println("A little after everyone gets done eating, the game finally comes to an end!");
				
				if(uscScore > floridaScore)
				{
					uscWin = true;
				}
				
				else if(uscScore < floridaScore)
				{
					floridaWin = true;
				}
				
				// usc win and usc fan
				if(uscWin == true && uscFan == true)
				{
					System.out.println("The Gamecocks win against the Florida Gators " +uscScore +"-" +floridaScore +"!");
					System.out.println("Here is a quick summary of your day:");
					System.out.println("You and Riley were hanging out when you two decided to go to a football game. ");
					System.out.println("Before you left for the game, you invited Markus to come with both of you. ");
					System.out.println("On the way to the game, Markus asked you to pick a number up to 10. ");
					
					if(numGuess == true)
					{
						System.out.println("Surpsingly, you were able to guess the number! "
								+ "Not only were Riley and Markus amused, Markus gave you $5 for guessing correctly. ");
					}
					
					else
					{
						System.out.println("Unfortunately, you didn't guess the correct number and you were teased by Markus.");
					}
					
					System.out.println("When you and the boys arrived at the game, you told them you were rooting for USC. "
							+ "Riley was very excited when he heard that and all of you starting celebrating in joy. ");
					System.out.println("During half time in the middle of the game, you and the boys decided to get something to eat. ");
					System.out.println("You got " +food +" to eat because it sounded like it would be very good. ");
					
					if(fbFoodR == fbFoodM)
					{
						System.out.println("Both Riley and Markus decided to get " +fbFoodR +".");
					}
					
					else
					{
						System.out.println("Riley got " +fbFoodR +" while Markus got " +fbFoodM +".");
					}
					
					System.out.println("At the end of the game, USC secured the victory against Florida and you celebrated with Riley and Markus!");
					System.out.println("The ending score of the game was " +uscScore +"-" +floridaScore +"!");
					System.out.println("After celebrating, you all decided to call it a day and go back home.");
					System.out.println("It was a great day.");
				}
				
				// usc win and florida fan
				else if(uscWin == true && floridaFan == true)
				{
					System.out.println("The Gamecocks win against the Florida Gators " +uscScore +"-" +floridaScore +"!");
					System.out.println("Here is a quick summary of your day: ");
					System.out.println("You and Riley were hanging out when you two decided to go to a football game. ");
					System.out.println("Before you left for the game, you invited Markus to come with both of you. ");
					System.out.println("On the way to the game, Markus asked you to pick a number up to 10. ");
					
					if(numGuess == true)
					{
						System.out.println("Surpsingly, you were able to guess the number! "
								+ "Not only were Riley and Markus amused, Markus gave you $5 for guessing correctly. ");
					}
					
					else
					{
						System.out.println("Unfortunately, you didn't guess the correct number and you were teased by Markus.");
					}
					
					System.out.println("When you and the boys arrived at the game, you told them you were rooting for Florida. "
							+ "Riley was very dissapointed when he heard that because he is a diehard USC fan. ");
					System.out.println("During half time in the middle of the game, you and the boys decided to get something to eat. ");
					System.out.println("You got " +food +" to eat because it sounded like it would be very good. ");
					
					if(fbFoodR == fbFoodM)
					{
						System.out.println("Both Riley and Markus decided to get " +fbFoodR +".");
					}
					
					else
					{
						System.out.println("Riley got " +fbFoodR +" while Markus got " +fbFoodM +".");
					}
					
					System.out.println("At the end of the game, you were a bit disappointed that Florida lost, but Riley was ecstatic. "
							+ "He rubbed the win all in your face. ");
					System.out.println("You'll never forget the score \""+uscScore +"-" +floridaScore +"\" since Riley screamed it so much. ");
					System.out.println("Although your team lost, you still had a great time with Riley and Markus. ");
					System.out.println("You guys then decided to call it a day and head home. ");
					System.out.println("It was a good day.");
				}
				
				// florida win and usc fan
				else if(uscWin == false && uscFan == true)
				{
					System.out.println("Unfortunately, the Gamecocks lost against the Florida Gators " +floridaScore +"-" +uscScore +".");
					System.out.println("Here is a quick summary of your day:");
					System.out.println("You and Riley were hanging out when you two decided to go to a football game. ");
					System.out.println("Before you left for the game, you invited Markus to come with both of you. ");
					System.out.println("On the way to the game, Markus asked you to pick a number up to 10. ");
					
					if(numGuess == true)
					{
						System.out.println("Surpsingly, you were able to guess the number! "
								+ "Not only were Riley and Markus amused, Markus gave you $5 for guessing correctly. ");
					}
					
					else
					{
						System.out.println("Unfortunately, you didn't guess the correct number and you were teased by Markus.");
					}
					
					System.out.println("When you and the boys arrived at the game, you told them you were rooting for USC. "
							+ "Riley was very excited when he heard that and all of you starting celebrating in joy. ");
					System.out.println("During half time in the middle of the game, you and the boys decided to get something to eat. ");
					System.out.println("You got " +food +" to eat because it sounded like it would be very good. ");
					
					if(fbFoodR == fbFoodM)
					{
						System.out.println("Both Riley and Markus decided to get " +fbFoodR +".");
					}
					
					else
					{
						System.out.println("Riley got " +fbFoodR +" while Markus got " +fbFoodM +".");
					}
					
					System.out.println("At the end of the game, USC lost against Florida " +floridaScore +"-" +uscScore +". ");
					System.out.println("You and Markus were dissapointed, but no words could describe what Riley felt after the loss. ");
					System.out.println("You guys decided to call it a day and head home, feeling defeated. ");
					System.out.println("Despite the loss, you still had a good time with Riley and Markus. ");
					System.out.println("It was a good day. ");
				}
				
				// florida win and florida fan
				else if(uscWin == false && floridaFan == true)
				{
					System.out.println("The Florida Gators win against the Gamecocks " +floridaScore +"-" +uscScore +"!");
					System.out.println("Here is a quick summary of your day: ");
					System.out.println("You and Riley were hanging out when you two decided to go to a football game. ");
					System.out.println("Before you left for the game, you invited Markus to come with both of you. ");
					System.out.println("On the way to the game, Markus asked you to pick a number up to 10. ");
					
					if(numGuess == true)
					{
						System.out.println("Surpsingly, you were able to guess the number! "
								+ "Not only were Riley and Markus amused, Markus gave you $5 for guessing correctly. ");
					}
					
					else
					{
						System.out.println("Unfortunately, you didn't guess the correct number and you were teased by Markus. ");
					}
					
					System.out.println("When you and the boys arrived at the game, you told them you were rooting for Florida. "
							+ "Riley was very dissapointed when he heard that because he loves USC with all his heart. ");
					System.out.println("During half time in the middle of the game, you and the boys decided to get something to eat. ");
					System.out.println("You got " +food +" to eat because it sounded like it would be very good. ");
					
					if(fbFoodR == fbFoodM)
					{
						System.out.println("Both Riley and Markus decided to get " +fbFoodR +".");
					}
					
					else
					{
						System.out.println("Riley got " +fbFoodR +" while Markus got " +fbFoodM +".");
					}
					
					System.out.println("At the end of the game, Florida won against USC " +floridaScore +"-" +uscScore +"! ");
					System.out.println("Riley was very disappointed that his team lost, but you were ecstatic and rubbed the win in his face! ");
					System.out.println("After you celebrated Florida's win, you all decided to call it a day and go back home. ");
					System.out.println("It was a good day although Riley was a bit disappointed in the end. But it's okay, he'll live. ");
				}
			}
			
			// markus not invited branch
			else
			{
				System.out.println("You and Riley decide not to invite Markus and both of you head to the game anyways. ");
				System.out.println("On the way to the game, Riley asks if you want to stop somewhere for lunch. Enter 'yes' or 'no.' ");
				String lunch = input.next();
				
				input.nextLine();
				
				if(lunch.equalsIgnoreCase("yes"))
				{
					System.out.println("Riley says that you guys can either go to Chick Fil A, Zaxbys, or Sonic. Which one do you want to go to?");
					String rest = input.nextLine();				// rest = restuarant
					
					if(rest.equalsIgnoreCase("chick fil a"))
					{
						System.out.println("You and Riley decide to stop by Chick Fil A to get some lunch. "
								+ "You guys end up lost in conversation for so long that you both forgot you were going to the football game!");
						System.out.println("You guys quickly head to the game, but you arrive late! ");
						System.out.println("Fortunately enough, you guys make it just in time to see USC win against the Florida Gators! ");
						System.out.println("Although you guys missed most of the game, you still celebrate the win together! ");
					}
					
					else if(rest.equalsIgnoreCase("zaxbys"))
					{
						System.out.println("You and Riley decide to stop by Zaxbys to get some lunch. ");
						System.out.println("You look at the menu and you want either boneless wings or chicken tenders. What do you want? ");
						zaxbys = input.nextLine();
						
						if(zaxbys.equalsIgnoreCase("boneless wings"))
						{
							System.out.println("You decided to get " +zaxbys +" while Riley got some buffalo wings. ");
						}
						
						else 
						{
							System.out.println("You decided to get " +zaxbys +" while Riley got some boneless wings. ");
						}
						
						System.out.println("After you finish eating with Riley, you guys head to the USC vs. Florida Gators game.");
						System.out.println("At the end of the game, it was a very close score. Unfortunately, USC lost by only one point! ");
						System.out.println("You and Riley decide to call it a day and head back home feeling heart broken.");
					}
					
					else if(rest.equalsIgnoreCase("sonic"))
					{
						System.out.println("You and Riley decide to stop by Sonic to get some lunch. ");
						System.out.println("You look at the menu and you want either a corn dog or burger. What do you want? ");
						sonic = input.nextLine();
						
						if(sonic.equalsIgnoreCase("burger"))
						{
							System.out.println("You decided to get a " +sonic +" while Riley got a corn dog. ");
						}
						
						else 
						{
							System.out.println("You decided to get " +sonic +" while Riley got a burger. ");
						}
						
						System.out.println("After you finish eating with Riley, you guys head to the USC vs. Florida Gators game.");
						System.out.println("At the end of the game, it was a very close score, with USC winning by a point! ");
						System.out.println("You and Riley celebrate this excitement inducing victory! ");
						System.out.println("After celebrating, you guys decide to call it a day and head back home. ");
						System.out.println("It was a good day.");
					}
				}
				
				else
				{
					System.out.println("You and Riley decide to just head straight to the game and not get any lunch. ");
					System.out.println("On the way there, a huge traffic jam happens and you guys are stuck right in the middle!");
					System.out.println("An hour passes in the traffic jam and you guys finally get out, which makes you late to the football game. ");
					System.out.println("When you and Riley finally get to the game, it is almost over. ");
					System.out.println("At the end of the game, USC gets demolished by the Florida Gators. ");
					System.out.println("You and Riley just decide to go back home because today sucked. ");
				}
				
			}
		}
		
		//========== beach branch ==========\\
		else if(response.equalsIgnoreCase("beach"))
		{
			input.nextLine();
			
			System.out.println("You and Riley decide to go to the beach. ");
			System.out.println("Before you get ready to leave, Riley gets the idea to invite your friend Markus. ");
			System.out.println("Do you invite Markus to the beach? Enter 'yes' or 'no.' ");
			String beach = input.next();
			
			if(beach.equalsIgnoreCase("yes"))
			{
				System.out.println("You and Riley decide to invite Markus to the beach. ");
				System.out.println("When you guys get to the beach, you all decide to go swimming. ");
				System.out.println("After you get done swimming, you and Markus decide to build sand castles to relive your childhoods. ");
				System.out.println("Riley comes up out of nowhere and jumps on them for fun! ");
				System.out.println("Was that funny or bad of Riley to do? Enter 'funny' or 'bad.' ");
				String riley = input.next();
				
				if(riley.equalsIgnoreCase("funny"))
				{
					System.out.println("All of you laugh it off because you're all having fun. ");
					System.out.println("The sun starts setting so you guys decide to call it a day and head back home. ");
					System.out.println("It was a great day at the beach. ");
				}
				
				else if(riley.equalsIgnoreCase("bad"))
				{
					System.out.println("You tell Riley that what he did wasn't cool because you and Markus "
							+ "put so much effort into those sand castles. ");
					System.out.println("Riley apologizes for his actions. Do you accept his apology? Enter 'yes' or 'no.' ");
					String apology = input.next();
					
					if(apology.equalsIgnoreCase("yes"))
					{
						System.out.println("You accept Riley's apology and realize it's starting to get late. ");
						System.out.println("You, Riley, and Markus all decide to head home. ");
						System.out.println("It was a good day at the beach. ");
					}
					
					else
					{
						System.out.println("You don't accept Riley's apology because he just ruined your sand castle and your "
								+ "entire kingdom that you had planned to build. ");
						System.out.println("The mood is ruined now so you all decide to head back home. ");
						System.out.println("It was an awkward car ride back home...");
					}
				}
			}
			
			else
			{
				System.out.println("You and Riley decide not to invite Markus to go to the beach with you. ");
				System.out.println("When you and Riley get to the beach, Riley decides to go swimming while you relax on the beach. ");
				System.out.println("While watching Riley swim in the ocean, you see a dark shadow following him in the water and you think it's a shark. ");
				System.out.println("Do you warn Riley about the shark? Enter 'yes' or 'no.' ");
				String shark = input.next();
				
				if(shark.equalsIgnoreCase("yes"))
				{
					System.out.println("You shout at Riley that there's a shark behind him!! ");
					System.out.println("He suddenly turns into Michael Phelps and swims back to shore in the blink of an eye. ");
					System.out.println("That was a close one. After the adrenaline wears off, you both decide to head back home. ");
					System.out.println("It sure was an eventful day at the beach. ");
				}
				
				else
				{
					System.out.println("You decide to not warn Riley about the shadow becuase you're not sure if it's a shark or not. ");
					System.out.println("A minute later, you see Riley swimming back to shore as fast as he can with the shadow following him. ");
					System.out.println("Suddenly you realize that it is, in fact, a shark, so you scream for him to come back fast! ");
					System.out.println("Riley makes it back to shore safely and you both decide to get out of there. ");
					System.out.println("It was a crazy day at the beach! ");
				}
			}
		}
		
		else
		{
			System.err.println("Invalid input. Closing program.");
			System.exit(0);			
		}
	}
}
