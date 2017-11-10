/**
 * Write a description of class NoLives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoLives implements AladdinState
{
   AladdinHero aladdinHero;
	
	public NoLives(AladdinHero newAladdinHero) {
		aladdinHero= newAladdinHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("Aladdin can not attack on Hurdles");
		
	}
}
