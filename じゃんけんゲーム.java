package schoolpractice;

import java.util.Scanner;

public class janken1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		boolean playAgain = true;
		while(playAgain) {
			
			int random1 = (int)(Math.random()*10)%2;
			int random2=(int)(Math.random()*10)%2;
			int random=random1+random2;
				
		System.out.println("------------------------------------");
		System.out.println("グー：０、チョキー：１、パー：２何を出す？");
		System.out.println("To Exit press : 7");
		System.out.println("------------------------------------");
		String[] choices = {"グー✊","チョキ✌️","パー🖐️"}; 
		
		int userInput = input.nextInt();
		
		if (userInput==7) {
			System.out.println("Exited sucessufully!!!! お疲れ様でした。 ");
			break;
		}
		if (userInput>2||userInput<0) {
			System.out.println("Invalid Number!!!  Try Again");
			continue;
		}
		if(userInput==random){
			System.out.println("------------------------------------");
			System.out.println("Computer: "+choices[random]);
			System.out.println("You: "+ choices[userInput]);
			System.out.println("Draw!! ");
		}else if((random == 1 && userInput== 0)||
				(random == 2 && userInput== 1)||
				(random == 0 && userInput== 2)) {
			System.out.println("------------------------------------");
				System.out.println("Computer: "+choices[random]);
				System.out.println("You: "+ choices[userInput]);
				System.out.println("You win!!");
		}else {
			System.out.println("------------------------------------");
				System.out.println("Computer: "+choices[random]);
				System.out.println("You: "+ choices[userInput]);
				System.out.println("Computer win!!");
				}
			}
		input.close();
		}
	}


