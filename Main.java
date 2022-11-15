// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		String choice = "";
		
		
		while(!choice.equals("quit")){
		
		System.out.println("Rock, Paper, or Scissors: or type quit to quit");
		choice = input.nextLine().toLowerCase();
		
		Random num = new Random();
		
		n = num.nextInt(3) + 1;
		
		if(n == 1) {
			System.out.println("Rock");
		}else if(n == 2){
			System.out.println("Paper");
		}else {
			System.out.println("Scissors");
		}
		 
		results(choice,n);
		
		
	} input.close();
	}
	

	public static void results(String choice,int n) {
		
		if (choice.equals("rock")) {
			if (n == 2) {
				System.out.println("I win.");
			} else if (n == 3) {
				System.out.println("You win.");
			} else if (n == 1) {
				System.out.println("It is a tie."); 
			} else {
				System.out.println("Wrong choice!");
			}
		}else if  (choice.equals("scissors")) {   
			if (n == 2) {
				System.out.println("You win.");
			} else if (n == 3) {
				System.out.println("It is a tie.");
			} else if (n == 1) {
				System.out.println("I win."); 
			} else {
				System.out.println("Wrong choice!");
			}
			
		}else if  (choice.equals("paper")) {
			if (n == 2) {
				System.out.println("It is a tie.");
			} else if (n == 3) {
				System.out.println("I win.");
			} else if (n == 1) {
				System.out.println("You win."); 
			} else {
				System.out.println("Wrong choice!");
			}
		}else if (choice.equals("quit")){
			System.out.println("Nice Challenge!");
		}else{
      System.out.println("Wrong choice!");
    }
      
			

  }
}