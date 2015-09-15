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
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses()
	{
		this.monsterNoses = monsterNoses;
	}
	 
	public void setMonsterLegs()
	 {
		 this.monsterLegs = monsterLegs;
	 }
	 
	public void setMonsterHair()
	 {
		 this.monsterHair = monsterHair;
	 }
	 
	public void setMonsterBellyButton()
	 {
		 this.monsterBellyButton = monsterBellyButton;
	 }
	 
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and its' name is " + monsterName + ". My monster also has " + monsterEyes + " eyes and " + monsterBellyButton + " belly button.";
		
		return monsterInfo;
	}
}
