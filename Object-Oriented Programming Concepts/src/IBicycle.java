
public interface IBicycle {
	
	
	// wheel revolutions per minute
	void changeCdence(int newValue);
	
	void changeGear(int newValue);
	
	void speedUp(int increment);
	
	void applyBrakes(int decrement);
	
}
