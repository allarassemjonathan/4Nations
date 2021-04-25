import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session {

	private int numWins;
	private int level = numWins%5;
	private Arena currentArena = new Arena();
	private String username;
	private String password;
	private Integer [][] mapArena;
	private static final ArrayList <Arena> ArenaList = new ArrayList(List.of(new Arena(), new Arena(), new Arena(), new Arena()));
	private GameCharacter personas;
	
	public Session() {
		
	}
	/**
	 * 
	 * @param username of the new user
	 * @param password of the new user 
	 */
	public Session(String username,String password) {
		this.numWins = 0;
		this.level = 0;
		// this.currentArena = ?? 
		this.username = username;
		this.password = password;
		this.personas = new GameCharacter(); //example
		
		
	
	}
	
	/**
	 * 
	 * @param file containing the user's data
	 * @throws FileNotFoundException 
	 */
	public Session(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {

			this.username = sc.nextLine().substring(11);
			this.password = sc.nextLine().substring(11);
			this.numWins = Integer.parseInt(sc.nextLine().substring(10));
			
		}
		
	}
	
	public char getAffinity() {
		return this.affinity;
	}
	
	public void setAffinity() {
		
	}
	/**
	 * 
	 * @param NumWins of the session's user to set
	 */
	public void setNumWins(int NumWins) {
		
	}
	
	/**
	 * 
	 * @return the number of victories in the session
	 */
	public int getNumWins() {
		return this.numWins;
	}
	
	/**
	 * 
	 * @param password of the session's user to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return the password of the session's user
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 
	 * @param username of the session's user to set
	 */
	public void setUsername(String username) {
		
	}
	
	/**
	 * 
	 * @return the username of the session's user
	 */
	public String getUsername() {
		return this.username;
	}
	
	/**
	 * 
	 * @param level of the session's user to set
	 */
	public void setLevel(int level) {
		
	}
	/**
	 * 
	 * @return the level of the session's user
	 */
	public int getLevel() {
		return this.level;
	}
	
	/**
	 * 
	 * @param persona of the session's user to set
	 */
	public void addPersonas(GameCharacter persona) {
		personas.add(persona);
	}
	
	/**
	 * 
	 * @param list of personas of the session's user to set
	 */
	public void setPersonas(ArrayList<GameCharacter> list) {
		this.personas = new ArrayList<>(list);
	}
	
	/**
	 * 
	 * @param arena of the session's user to set
	 */
	public void setcurrentArena(Arena arena) {
		this.currentArena = arena;
	}
	
	/**
	 * 
	 * @return the Arena of the session's user
	 */
	public Arena getcurrentArena() {
		return this.currentArena;
	}
}

