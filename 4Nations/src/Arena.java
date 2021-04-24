import java.util.ArrayList;
import java.util.Random;

public class Arena {
	private GameCharacter typicalCombatant;
	private String[] possibleAliases;
	private char affinity;
	
	public Arena(GameCharacter tc, String[] pa, char affinity) {
		
		possibleAliases = new String[pa.length];
		for(int i = 0; i < pa.length; i++) {
			possibleAliases[i] = pa[i];
		}
		
		typicalCombatant = new GameCharacter(tc);
		
		this.affinity = affinity;
		
	}
	
	/** Provides an opponent for the player within the Arena. Uses typicalCombatant with modified
	 *  stats based on the level of player and name generated from possibleAliases.
	 * @param player - user's active GameCharacter
	 * @return - GameCharacter to fight
	 */
	public GameCharacter getOpponent(GameCharacter player) {
		
		Random r = new Random();
		String name = possibleAliases[r.nextInt(possibleAliases.length)];
		
		GameCharacter opponent = new GameCharacter(this.typicalCombatant.getAffinity(), name, 
				(this.typicalCombatant.getAttack() + player.getLevel()), 
				(this.typicalCombatant.getMaxVitality() + player.getLevel()), 
				(this.typicalCombatant.getSpeed() + player.getLevel()), typicalCombatant.getAttacks());
		
		return opponent;
		
	}

}
