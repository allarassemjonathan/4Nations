import java.util.ArrayList;
import java.util.Random;

public class Arena {
	private GameCharacter typicalCombatant;
	private String[] possibleAliases;
	private char affinity;
	
	public Arena(GameCharacter typicalCombatant, String[] possibleAliases, char affinity) {
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
