/**
 * Class designed to purchase stamps
 * @author brettnelson
 */

public class StampMachine {

	private int dollars = 0;
	private double remainder = 0;
	
	public void insert(int amount)
	{
		dollars = amount;
	}
	
	public int giveFirstClassStamps()
	{
		remainder = dollars%0.44;
		return (int)(dollars/0.44);
	}
	
	public int givePennyStamps()
	{
		return (int)(remainder*100);
	}
}
