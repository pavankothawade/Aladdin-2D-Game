
public class AladdinHero {
	AladdinState hasLives;
	AladdinState noLives;
	AladdinState aladdinstate;
	int noOfLives=3;
	
	public AladdinHero(){
		hasLives= new HasLives(this);
		noLives= new NoLives(this);
		aladdinstate= hasLives;
		
		if(noOfLives == 0){
			aladdinstate= noLives;
		}
	}
	void setAladdinState(AladdinState newAladdinState){
		aladdinstate= newAladdinState;
	}
	public AladdinState getHasLivesState(){
		System.out.println("In HasLivesState");
		return hasLives;
		
	} 
	public AladdinState getNoLivesState(){
		System.out.println("In NoLivesState");
		return noLives;
		
	} 
}
