
public class BitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bitmask = 0x000F;
		
		int val = 0x2222;
		
		// 0000 0000 0000 1111
		// 0010 0010 0010 0010
		
		// prints "2"
		System.out.println(val & bitmask);

	}

}
