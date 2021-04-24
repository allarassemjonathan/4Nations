
public class Test {

	public static void main(String[] args) {
		
		int[][] dice = {{4,4}};
		
		Attack a = new Attack(dice, true, true, 0);

		for (int i = 0; i < 10; i++) System.out.println(a.findAttackDamage());
	}

}
