import java.util.Scanner;

public class ch4_24 {
	public static void main(String [] args){	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first city: ");
	String city1 = input.nextLine();
	System.out.println("Enter the second city: ");
	String city2 = input.nextLine();
	System.out.println("Enter the third city: ");
	String city3 = input.nextLine();
	
	String city;
	if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
	{
		city = city1;
		city1 = city2;
		city2 = city;	
	}
	if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
	{
		city = city1;
		city1 = city3;
		city3 = city;
		
	}
	if (city3.compareTo(city2) < 0)
	{
		city = city2;
		city2 = city3;
		city3 = city;
	}

	System.out.println("The three cities in alphabetical order are " +
	city1 + ", " + city2 + ", " + city3 + ". ");
	}
}
	
