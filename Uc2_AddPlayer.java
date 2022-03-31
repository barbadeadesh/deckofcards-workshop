import java.util.Scanner;

public class Uc2_Player {

	public static void main(String[] args) {
		
		//taking Input From user
		
				Scanner sc = new Scanner(System.in);
				
				//Diplay the message at the time of of taking input
				
				System.out.println("Enter the player for game of deck of card : ");
				
				int a = sc.nextInt();
				
				// use if else condition
				if(a>=2 && a<=4) {
					System.out.println("Player playing the game of deck of card  are :" +a );
				}
				else {
					System.out.println("Player is not exist");

	}

}
	
}