
public class NoLives implements AladdinState {
	AladdinHero aladdinHero;
	
	public NoLives(AladdinHero newAladdinHero) {
		aladdinHero= newAladdinHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("Aladdin can not attack on Hurdles");
		
	}

}
