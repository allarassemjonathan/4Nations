abstract public class GameCharacter {
	private char affinity; //Egyptian, Persian, Roman, or Greek
	private String name;
	private int attack;
	private int maxVitality;
	private int currentVitality;
	private int speed;
	private int level;
	private Attack[] Attacks;
	
	public GameCharacter(char affinity, String name, int attack, int vitality, int speed, Attack[] Attacks) {
		
	}
	public String getName() {
		return "";
	}
	public void setName(String name) {
	}
	public int getAttack() {
		return 0;
	}
	public void setAttack(int attack) {
	}
	public int getCurVitality() {
		return 0;
	}
	public void setCurVitality(int vitality) {
	}
	public int getMaxVitality() {
		return 0;
	}
	public void setMaxVitality(int vitality) {
	}
	public int getSpeed() {
		return 0;
	}
	public void setSpeed(int speed) {
	}
	public char getAffinity() {
		return ' ';
	}
	public void setAffinity(char affinity) {
	}
	public int getLevel() {
		return 0;
	}
	/** Increments level member variable
	 */
	public void incrementLevel() {
	}
	/** Simulates using an attack.
	 * @param attackNum - the index of the attack within Attacks
	 * @return number of damage to be dealt; negative values are self-restoring rather than damaging
	 */
	public int attack(int attackNum) {
		return 0;
	}
	/** Simulates taking damage by reducing vitality by set amount.
	 * @param numDamage - the amount of damage to be taken
	 */
	public void takeDamage(int numDamage) {
	}
}
