package monster;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;

	private MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterLegs, double monsterHair, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;

	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and its' name is " + monsterName;
		
		return monsterInfo;
	}
}
