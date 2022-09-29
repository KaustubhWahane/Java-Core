package pookage;
	/*
	  Reason we are declaring is because we are gonna create another object of Restaurant 
	  which is gonna create a new restaurant and its gonna help people give them food,
	  washroom or kitchen
	 */
	public abstract class Restaurant {
		
		//Let's create three abstract methods
		//Remember its just to create the reference of the object
		
		abstract void food();
		
		abstract void washroom();
		
		abstract void kitchen();
	

}
