package exersizes;
import java.util.Scanner;
public class numChoice {

	public static void main(String[] args) 
	{
        int numChoice;
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Please pick an even number ");
        numChoice = input.nextInt();
        
        if(numChoice % 2 == 0)
        {
        	System.out.println("Good job");
        }
        else
        {
        	System.out.println("Error");
        }
        }while(numChoice != 999);
	}

}
