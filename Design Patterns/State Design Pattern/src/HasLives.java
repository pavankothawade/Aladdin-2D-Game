
public class HasLives implements AladdinState {
	AladdinHero aladdinHero;

	public HasLives(AladdinHero newAladdinHero) {
		aladdinHero= newAladdinHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("Aladdin can attack on Hurdles");
		
	}

}
