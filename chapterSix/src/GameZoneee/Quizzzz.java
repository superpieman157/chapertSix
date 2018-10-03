package GameZoneee;

import java.util.Scanner;

public class Quizzzz {

	public static void main(String[] args) 
	{
       int userAnswer;
       int Score = 0;
       Scanner input = new Scanner(System.in);
       System.out.println("1. What is 3 x 4, is it "
    		    + "1. 5    2. 7    3. 12    4. 20");
       userAnswer = input.nextInt();
       
       if(userAnswer == 3)
       {
    	   System.out.println("Right");
    	   Score = Score + 1;
       }
       else
       {
    	   System.out.println("Wrong");
       }
       System.out.println("How many letters in the alphabet"
    		   + "1. 30    2. 26    3. 24    4. 999");
       userAnswe
	}

}
