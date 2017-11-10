/**
 * Write a description of class HasLives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasLives implements AladdinState
{
    AladdinHero aladdinHero;

	public HasLives(AladdinHero newAladdinHero) {
		aladdinHero= newAladdinHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("Aladdin can attack on Hurdles");
		
	}
}
