package MyaccountManagementSystem;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManger accountManger = new AccountManger(input);
  	    int num = 4;
	
	    while (num != 5) {
		        System.out.println("*** Accouunt Management System menu ***");
	         	System.out.println("1. Add Money");
	        	System.out.println("2. Delete Money");
	        	System.out.println("3. View Money");
	         	System.out.println("4. Show a menu");
	        	System.out.print("Select one number between 1-4:");
	        	num = input.nextInt();
	        	if(num == 1 ) {
	        		accountManger.addMoney();
	        	}
	        	else if (num == 2) {
	        		accountManger.deleteMoney();
	        	}
	        	else if (num == 3) {
	        		accountManger.viewMoney();
	            }
	        	else {
	        		continue;
	     	 }

    	}
	}
}