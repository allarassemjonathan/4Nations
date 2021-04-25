import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author ALLARASSEMJJ20
 *
 */
public class GameManager {
	
	private final File db = new File("database.txt");
	private HashMap<String,String> credentials;
	private Session currentSession;
	private String dbcontent;
	private boolean isLogged;
	
	
	/**
	 * 
	 * @param username of the session's owner
	 * @param password of the session's owner
	 * @return
	 */
	public 	Session createNewSession(String username, String password) {
		Session session = new Session(username,password);
		return session;
	}
	
	/**
	 * 
	 * @param file from where we load the data
	 * @throws FileNotFoundException
	 */
	public void LoadDataUser(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(file);
		this.dbcontent = "";
		String line = "";
		this.credentials = new HashMap<>();
		
		while(in.hasNext()) {
			
			/*
			 * Load the data in the HashMap
			 */
			
			String un = "";
			String pw = "";
			line = in.nextLine();
			this.dbcontent += line + "\n";
			Scanner mapSc = new Scanner(line);
			
			if(mapSc.next().equals("username")) {
				un = mapSc.next();
			}
			if(mapSc.next().equals("password")) {
				pw = mapSc.next();
			}
			this.credentials.put(un, pw);
		}
	}
	
	/**
	 *  Delete/Forget all the data related to one game
	 */
	
	public void deleteSession(File file) {
		
	}
	
	/**
	 * 
	 * @param file the data of the user
	 */
	public void resumeSession(File file) {
		try {
			this.currentSession = new Session(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 * @param username of user
	 * @param password of user
	 * @return true if login successful | false if the login failed
	 * @throws FileNotFoundException if the file is not found
	 */
	public void Login(String username,String password) throws FileNotFoundException {
		if(this.HasAccount(username,password)) {
			File file = new File(username + password + "data.txt");
			this.resumeSession(file);
		}
		else {
			System.out.println("Try again or register if you dont have an account");
		}
	}
	
	/**
	 * 
	 * @param username of the new user
	 * @param password of the new user
	 * @return true if registration successful | false if the registration failed
	 * @throws FileNotFoundException 
	 */
	public void Register(String username,String password) {
		try {
		if(!(this.HasAccount(username, password))){
			/*
			 * Add the user in the database
			 */
			PrintWriter pen = new PrintWriter(db);
			pen.println(dbcontent  + "username " + username + " password " + password);
			pen.close();
			
			/*
			 * Create a file to hold the data of the user
			 */
			
			OutputStream ou = new FileOutputStream(username + password + "data.txt");
			PrintWriter bic = new PrintWriter(ou);
			bic.println("username : " + username);
			bic.println("password : " + password);
			bic.println("numWins : " + 0);
			bic.println("Arena : " + this.currentSession.getcurrentArena().toString());
			System.out.println("registration successful");
		
			// you have a level for your progression
			bic.close();
			
		}
		else {
			this.Login(username, password);
			System.out.println("It looks like you forgot that you already have an account");
		}
		}
		catch(FileNotFoundException f) {
			System.out.println("Sorry you are not able to open your account");
		}
		catch(Exception e) {
			System.out.println("Give a correct input");
		}
		
	}
	
	/**
	 * 
	 * @param username of the connecting user
	 * @param password of the connecting user
	 * @return true if user has an account | false if user does not have an account
	 * @throws FileNotFoundException is thrown if the file is not found
	 */
	public boolean HasAccount(String username, String password) {
		try {
			this.LoadDataUser(db);
			String dbpass = credentials.get(username);
			if(dbpass == null) {
				return false;
			}
			return dbpass.equals(password);
		}catch(FileNotFoundException f) {
			System.out.println("We were unable to load your progress please restart the game");
			return false;
		}catch(Exception e) {
			System.out.println("An error occured while logging please try again");
			return false;
		}
		
	}
	
	/**
	 * 
	 * @param username of the new user
	 * @param password of the new user
	 */
	public void addCredential(String username,String password) {
		this.credentials.put(username, password);
	}
	
	/**
	 * 
	 * @return the credential HashMap 
	 * containing the username and 
	 * password of people
	 */
	public HashMap<String, String> getCredentials() {
		return this.credentials;
	}
	
	public void Manager() {
		
		try{
			System.out.println("Welcome to the 4 Nations\n");
			System.out.println("1 Registration\n2 Login\n3 About us.\n");
			Scanner sc = new Scanner(System.in);
			int entry = sc.nextInt();
			
			switch(entry) {
				case 1 :
					System.out.println("\nRegistration\nusername: ");
					String username1 = sc.next();
					System.out.println("\npassword: ");
					String password1 = sc.next();
					this.Register(username1,password1);
					this.currentSession = new Session(username1,password1);
					isLogged = true;
					break;
				case 2 :
					System.out.println("\nLogin\nusername: ");
					String username2 = sc.next();
					System.out.println("\npassword: ");
					String password2 = sc.next();
					this.Login(username2, password2);
					isLogged = true;
					break;
				case 3 :
					System.out.println("Empty but will soon be filled");
			}
			
	}catch(FileNotFoundException f) {
			System.out.println("Sorry you are not able to open your account");
	}catch(InputMismatchException i) {
			System.out.println("Give a correct input");
	}catch(Exception e) {
			System.out.println("Sorry an error occured, the game is saving your progress and restarting");
	}
	
		if(isLogged) {
			System.out.println("You are logged");
			System.out.println("Welcome " + currentSession.getUsername());
			
		}
}
}


