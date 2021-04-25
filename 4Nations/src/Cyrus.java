
public class Cyrus extends GameCharacter{
	
	private final static int BASE_ATTACK = 10;
	private final static int BASE_VITALITY = 45;
	private final static int BASE_SPEED = 10;
	private final static char NATURAL_AFFINITY = 'P';
	
	private final static boolean ATTACK1_ALWAYSHITS = false;
	private final static boolean ATTACK1_ISHEALING = false;
	private final static int ATTACK1_RECOIL = 0;
	
	private final static int[][] ATTACK1_DICE = {{6,1}};
	private final static Attack ATTACK1 = new Attack(ATTACK1_DICE, ATTACK1_ALWAYSHITS, ATTACK1_ISHEALING, ATTACK1_RECOIL);
	
	private final static boolean ATTACK2_ALWAYSHITS = true;
	private final static boolean ATTACK2_ISHEALING = false;
	private final static int ATTACK2_RECOIL = 0;
	
	private final static int[][] ATTACK2_DICE = {{0,0}};
	private final static Attack ATTACK2 = new Attack(ATTACK2_DICE, ATTACK2_ALWAYSHITS, ATTACK2_ISHEALING, ATTACK2_RECOIL);
	
	private final static boolean ATTACK3_ALWAYSHITS = false;
	private final static boolean ATTACK3_ISHEALING = false;
	private final static int ATTACK3_RECOIL = 0;
	
	private final static int[][] ATTACK3_DICE = {{4,3}};
	private final static Attack ATTACK3 = new Attack(ATTACK3_DICE, ATTACK3_ALWAYSHITS, ATTACK3_ISHEALING, ATTACK3_RECOIL);
	
	
	private final static Attack[] ATTACKS = {ATTACK1, ATTACK2, ATTACK3};


	public Cyrus(char affinity, String name, int attack, int vitality, int speed, Attack[] Attacks) {
		super(NATURAL_AFFINITY, "Cyrus the Great", BASE_ATTACK, BASE_VITALITY, BASE_SPEED, ATTACKS);
		
	}

}
