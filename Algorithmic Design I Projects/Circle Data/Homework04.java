import java.util.Scanner;
public class Homework04 {

	public static final double PI = 3.14;
	
	public static void main(String[] args) {

		// Robert Porter
		
		Scanner input = new Scanner(System.in);
		
		// declare variables
		double circleSize;
		boolean validSize = false;
		
		// ask user for total number of circles. if the amount is <= 0, tell user to input a valid value
		System.out.println("Enter the number of circles: ");
		circleSize = input.nextDouble();
		
		if(circleSize > 0)
		{
			validSize = true;
		}
		
		while(validSize == false)
		{
			System.out.println("Invalid input! Please enter an amount of circles greater than 0.");
			circleSize = input.nextDouble();
			
			if(circleSize > 0)
			{
				validSize = true;
			}
		}
		
		// create array for each radius and area
		double[] radiusArray = new double[(int) circleSize];
		double[] area = new double[(int) circleSize];
		
		// ask user for the radius of each circle
		for(int i = 0; i < radiusArray.length; i++)
		{
			System.out.println("Enter the radius of circle " +(i+1) +":");
			radiusArray[i] = input.nextDouble();
			
			// calculating area. pi * radius^2
			area[i] = PI * radiusArray[i] * radiusArray[i];
		}
		
		input.nextLine();
		
		// set up loop to run program
		boolean runProgram = true;
	
		do 
		{

		// ask user which way they want to sort
		System.out.println("Would you like to view the circle data, sort the circles (by area) from smallest to largest, "
						+ "sort from largest to smallest, or find and display all circles with unique areas?");
		boolean validResponse = false;
		while(validResponse == false)
		{
			System.out.println("Enter \"data\" to see circle data, \"small\" for smallest to largest, \"large\" for largest to smallest, "
					+ "or \"unique\" for each unqiue circle.");
			String response = input.nextLine();
			
			// print radius and area of each circle
			if(response.equalsIgnoreCase("data"))
			{
				validResponse = true;
				System.out.println("Here are the calculated areas from each circle:");
				for (int i = 0; i < circleSize; i++)
				{
					System.out.printf("Circle %d: Radius = %.2f; Area = %.2f%n", (i+1), radiusArray[i], area[i]);
				}
			}
			
			// sort by smallest to largest
			else if(response.equalsIgnoreCase("small"))
			{
				validResponse = true;
				for(int i = 0; i < circleSize - 1; i++)
				{
					for(int j = 0; j < circleSize - 1 - i; j++)
					{
						if(area[j] > area[j + 1])
						{
							double tempArea = area[j];
							area[j] = area[j + 1];
							area[j + 1] = tempArea;
							
							double tempRadius = radiusArray[j];
							radiusArray[j] = radiusArray[j + 1];
							radiusArray[j + 1] = tempRadius;
						}
					}
				}
				
				// print sorted results
				System.out.println("Here are the areas of each circle from smallest to largest:");
				for (int i = 0; i < circleSize; i++)
				{
					System.out.printf("Circle %d: Radius = %.2f; Area = %.2f%n", (i+1), radiusArray[i], area[i]);
				}
			}
			
			// sort by largest to smallest
			else if(response.equalsIgnoreCase("large"))
			{
				validResponse = true;
				for(int i = 0; i < circleSize - 1; i++)
				{
					for(int j = 0; j < circleSize - 1 - i; j++)
					{
						if(area[j] < area[j + 1])
						{
							double tempArea = area[j];
							area[j] = area[j + 1];
							area[j + 1] = tempArea;
							
							double tempRadius = radiusArray[j];
							radiusArray[j] = radiusArray[j + 1];
							radiusArray[j + 1] = tempRadius;
						}
					}
				}
				
				// print sorted results
				System.out.println("Here are the areas of each circle from largest to smallest:");
				for (int i = 0; i < circleSize; i++)
				{
					System.out.printf("Circle %d: Radius = %.2f; Area = %.2f%n", (i+1), radiusArray[i], area[i]);
				}
			}
			
			// sort by unique areas
			else if(response.equalsIgnoreCase("unique"))
			{
				validResponse = true;
				boolean uniqueAreas = false;
				
				System.out.println("Here are all of the circles with unique areas:");
				for(int i = 0; i < circleSize; i++)
				{
					boolean duplicate = false;
					
					for(int j = 0; j < circleSize; j++)
					{
						if(i != j && area[i] == area[j])
						{
							duplicate = true;
						}
					}
					
					// print circles with unique areas
					if(duplicate == false)
					{
						System.out.printf("Circle %d: Radius = %.2f; Area = %.2f%n", (i+1), radiusArray[i], area[i]);
						uniqueAreas = true;
					}
				}
				
				// print message when there are no cirlces with unique areas
				if(!uniqueAreas)
				{
					System.out.println("Collection empty! There are no circles with unique areas. Cannot sort an empty collection.");
				}
			}
			
			else
			{
				System.out.println("Invalid response!");
			}
		}
		
		// ask user if they want to keep sorting or quit program
		boolean answer = false;
		while(answer == false)
		{
			System.out.println("Would you like to sort circle data again or quit program?");
			System.out.println("Enter \"sort\" or \"quit.\"");
			String runResponse = input.next();
		
			if(!runResponse.equalsIgnoreCase("sort") && !runResponse.equalsIgnoreCase("quit"))
			{
				System.out.println("Invalid input!");
			}
			
			else if(runResponse.equalsIgnoreCase("quit"))
			{
				answer = true;
				runProgram = false;
				System.out.println("End of program! Exiting...");
				System.exit(0);
			}
			
			else
			{
				answer = true;
			}
		}
		
		input.nextLine();
		
		}while(runProgram == true);
	}
}
