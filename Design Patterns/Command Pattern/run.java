public void run implements Reciever{
	


playCmd.setReciever(

new Reciever(){
	
public void executeCommandAction(){
	

	if(Greenfoot.mouseClicked(buttonPlay)){
	Greenfoot.setWorld(new Scenario());

	}
}

}


);
public void setReciever(Reciever newRec){
	

	this.playReciever =newRec;
}

public void runCommand(){
	playReciever.executeCommandAction();
}



}