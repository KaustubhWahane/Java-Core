package mypack2;


interface HomeRouter{
	void wifiName();
	void wifiSpeed();
}

abstract class Wifi implements HomeRouter{
	
	public void wifiName() {
		System.out.println("This will be the name of the Wifi");
	}
	
	public void wifiSpeed() {
		System.out.println("This will be the speed of Wifi");
	}
}

class Citylink extends Wifi{
	
	@Override
	public void wifiName() {
		System.out.println("Wifi name is Citylink");
	}
	
	@Override
	public void wifiSpeed() {
		System.out.println("Speed of Wifi is 1Tbps");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Citylink c1 = new Citylink();
		c1.wifiName();
		c1.wifiSpeed();

	}

}
