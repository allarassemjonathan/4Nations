import java.util.ArrayList;

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
		return null;
	}

}
