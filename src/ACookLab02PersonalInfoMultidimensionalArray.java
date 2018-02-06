import java.util.*;

public class ACookLab02PersonalInfoMultidimensionalArray {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		new ACookLab02PersonalInfoMultidimensionalArray();
	}
	
	public ACookLab02PersonalInfoMultidimensionalArray() {
		String[][] personalInfo = new String[10][4];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				personalInfo[i][j] = "";
			}
		}
		
		System.out.println("Use the menu below to manage personal info held in the database.");
		System.out.println("");
		
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add a contact to the list.");
			System.out.println("2: Remove a contact from the list.");
			System.out.println("3: Display entries in the list.");
			System.out.println("0: Exit the program.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();

			
			switch (userChoice) {
				case 1:
					addItem(personalInfo);
					break;
				case 2:
					removeItem(personalInfo);
					break;
				case 3:
					displayItems(personalInfo);
					break;
				case 0:
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid value. Choose a number 0-3 only.");
					break;
			}
		}
	}
	
	private void addItem(String personalInfo[][]) {
		if(Arrays.deepToString(personalInfo).contains("")) { //if statement checks if there is any empty value in the array
			String userInput;
			for(int i = 0; i < 10; i++) {
				if (personalInfo[i][0].equals("")) {
					System.out.println("Enter the first name of the contact below.");
					userInput = input.nextLine();
					personalInfo[i][0] = userInput;
					System.out.println("Enter the last name of the contact below.");
					userInput = input.nextLine();
					personalInfo[i][1] = userInput;
					System.out.println("Enter the phone number of the contact below.");
					userInput = input.nextLine();
					personalInfo[i][2] = userInput;
					System.out.println("Enter the age of the contact below.");
					userInput = input.nextLine();
					personalInfo[i][3] = userInput;
					//System.out.println(Arrays.deepToString(personalInfo));
					break;
				}
			}
		} else {
			System.out.println("The database is full. You need to remove an entry to add a new one.");
		}
		return;
	}

	private void removeItem(String personalInfo[][]) {
		System.out.println("Enter the number of the entry to be removed.");
		int userInput = input.nextInt() - 1;
		
		if(!personalInfo[userInput][0].equals("")) {
			/*System.out.println("Array if statement evaluated that the value is contained in the array.");*/
			for(int i = 0; i < 4; i++) {
				personalInfo[userInput][i] = "";
			}
			System.out.println("Item removed.");
		} else {
			System.out.println("That entry is empty.");
		}
		
		return;
	}
	
	private void displayItems(String personalInfo[][]) {
		System.out.println("Enter the number of the entry to be displayed.");
		int userInput = input.nextInt() - 1;
		
		if(!personalInfo[userInput][0].equals("")) {
			/*System.out.println("Array if statement evaluated that the value is contained in the array.");*/
			for(int i = 0; i < 4; i++) {
				System.out.println(personalInfo[userInput][i]);
			}
		} else {
			System.out.println("That entry is empty.");
		}
		
		return;
	}
}
