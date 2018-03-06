
public class Bicycle {
	
	// the Bicyle class has three fields
	
	public int cadence;
	public int gear;
	public int speed;
	
	// the Bicycle class has two constructors
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
		
	}
	
	public Bicycle() {
		gear = 1;
		cadence = 10;
		speed = 0;
	}
	
	
	public int getCadence() {
		return cadence;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public int getSpeed() {
		return speed;
	}

}
