
public class Attack {
	private int[][] dice;
	public boolean alwaysHits;
	public boolean isHealing;
	public int recoil;
	
	public Attack(int[][] dice, boolean alwaysHits, boolean isHealing, int recoil) {
		
	}
	
	/** Finds amount of damage dealt or vitality healed by attack
	 * @return - said amount -  positive value is damage dealt; negative value is vitality healed
	 */
	public int findAttackDamage() {
		return 0;
	}
	/** Provides description of effects of attack
	 * @return - String description
	 */
	public String getInfo() {
		return "";
	}

}
