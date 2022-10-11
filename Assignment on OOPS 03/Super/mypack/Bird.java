package mypack;

 class Pelican extends Bird{
	 //Making a super() to invoke Bird class properties
	 Pelican(){
		 super();
		 System.out.println();
	 }
}

public class Bird {
	Bird() {
		 System.out.println("A bird sings");
	 }
	
	public static void main(String[] args) {
		Pelican p1 = new Pelican();
			
	}

}
