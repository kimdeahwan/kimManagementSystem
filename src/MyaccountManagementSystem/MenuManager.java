package MyaccountManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  	    int num = 4;
	
	    while (num != 5) {
		        System.out.println("*** Accouunt Management System menu ***");
	         	System.out.println("1. Add Money");
	        	System.out.println("2. Delete Money");
	        	System.out.println("3. View Money");
	         	System.out.println("4. Show a menu");
	        	System.out.println("5. Exit");
	        	System.out.print("Select one number between 1-6:");
	        	num = input.nextInt();
	        	if(num == 1 ) {
		        	addMoney();
	        	}
	        	else if (num == 2) {
	        		deleteMoney();
	        	}
	        	else if (num == 3) {
	        		viewMoney();
	            }
	        	else {
	        		continue;
	     	}

    	}

}

    public static void addMoney() {
    	Scanner input = new Scanner(System.in);
	    System.out.print("how much?:");
    	int studentId = input.nextInt();
    }
    public static void deleteMoney() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("how much:");
	    int studentId = input.nextInt();
    }
    public static void viewMoney() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("now money:");
    	int studentId = input.nextInt();
	}
}
