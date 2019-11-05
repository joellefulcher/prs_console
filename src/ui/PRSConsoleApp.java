package ui;

import java.util.ArrayList;
import java.util.List;
import business.User;
import util.Console;

public class PRSConsoleApp {


	private static Object updateUsers;

	public static void main(String[] args) {
		System.out.println("PRS Console\n");
	
		// initialize a variable???
		int userNum = 0;
		int userNum1 = 0;
		
		
		// new console
		Console console = new Console();
		
		// initialize ArrayList
		List<User> users = new ArrayList<User>();
		
		// create user define class objects; initialize a list of users
		User u1 = new User (1, "Count Dracula", "Count", "Dracula", "555-555-5555", "blahblahblah@yahoo.com");
		User u2 = new User (2, "Mary Shelley", "Mary", "Shelley", "555-5556-5566", "MyGuyFrank@gmail.com");
		User u3 = new User (3, "Lon Chaney, Jr", "Lon", "Chaney, Jr", "555-5577", "TalbortPet@gmail.com");
		User u4 = new User (4, "Gill Man", "Gill", "Man", "555-555-5588", "BlackLagoon@yahoo.com");
		User u5 = new User (5, "Im Hotep", "Im", "Hotep", "555-5599", "EgyptMummyCurse@yahoo.com");
		
		// switch statement for CRUD functions
		int command = 0;
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);
			
			switch (command) {
			case 1:
				// list users
				show(users);
				break;
			case 2:
				// get user
				if (users.size() >= 6) {
					System.out.println("Too many users.");
				}
				User.getId(command);
				break;				
			case 3:
				// add user
				int userNum2 = users(5, "Im Hotep", "Im", "Hotep", "555-5599", "EgyptMummyCurse@yahoo.com");
				users.add(userNum1 - 1, u4);
				break;
			case 4:
				// update user
				String userEmail = users("EgyptMummyCurse@yahoo.com");
				String newEmail = Console.getString("New Email: " + userEmail);
				updateUsers(userNum1 - 1, newEmail);
				break;
			case 5:
				// delete user
				User userId = users.remove(5);
				String newUser = Console.getString("New Email: ");
				users.remove(userNum1 - 1);
				break;
			case 6:
				// exit menu
				break;
			default:
				// invalid command
				System.out.println("Invalid command.");
				break;
			}
			
		}
		
		
		
		System.out.println("Bye");
	}

	
	private static void updateUsers(int i, String newEmail) {
		// TODO Auto-generated method stub
		
	}


	private static String users(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	private static int users(int i, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return 0;
	}


	// displays to console
	private static void show(List<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println((i + 1) +  ") " + users.get(i - 1));
			}
	}
		
	// displays command menu to the console
	private static String getMenu() {
		String menu = "COMMAND MENU:\n" +
					  "1 - User List\n" +
					  "2 - Get User\n" +
					  "3 - Add User\n" +
					  "4 - Update User\n" +
					  "5 - Delete User\n" +
					  "6 - Exit\n" +
					  "Command: ";
		return menu;
	}


	public static Object getUpdateUsers() {
		return updateUsers;
	}


	public static void setUpdateUsers(Object updateUsers) {
		PRSConsoleApp.updateUsers = updateUsers;
	}
}
