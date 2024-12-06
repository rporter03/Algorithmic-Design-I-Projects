import java.util.Scanner;

public class ClockTimeDemo {

	public static void main(String[] args) {

		// Robert Porter
		
		boolean runProgram = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Convert military time into 12-hour clock time!");
		
		do
		{
			
		// first time object
		TimeConverter time1 = new TimeConverter();
		System.out.println("Enter the hours on the military clock:");
		int hours = scanner.nextInt();
		System.out.println("Enter the minutes on the military clock:");
		int minutes = scanner.nextInt();
		System.out.println("Enter the seconds on the military clock:");
		int seconds = scanner.nextInt();
		
		try
		{
			time1.updateTime(hours, minutes, seconds);
			System.out.println("12 hour clock time: " +time1.displayTime());
		}
		
		catch (TimeException e)
		{
			System.out.println(e.getMessage());
		}
		scanner.nextLine();
		
		// second time object
		TimeConverter time2 = new TimeConverter();
		System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\"");
		String time = scanner.nextLine();
		
		try
		{
			time2.updateTime(time);
			System.out.println("12 hour clock time: " +time2.displayTime());
		}
		
		catch (TimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Would you like to do this again? Enter \"Yes\" or \"No\":");
		String response = scanner.nextLine();
		
		if(response.equalsIgnoreCase("no"))
		{
			System.out.println("Exiting the program!");
			runProgram = false;
		}
		}while(runProgram == true);
	}
}
