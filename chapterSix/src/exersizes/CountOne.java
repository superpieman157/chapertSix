package exersizes;
import java.util.Scanner;
public class CountOne {

	public static void main(String[] args) 
	{
		int userNum;
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number ");
		userNum = input.nextInt();
		for(int count = userNum; count <= userNum * 100; count = count + userNum)
		{
        System.out.println("Count to "+ count);
		}
		
	}

}
