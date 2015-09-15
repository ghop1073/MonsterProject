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
	
	public String getmonsterName()
	{
		return monsterName;
	}
	
	public int getmonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getmonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getmonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getmonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getmonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setmonsterNoses()
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
	 
	public void setmonsterBellyButton()
	 {
		 this.monsterBellyButton = monsterBellyButton;
	 }
	 
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and its' name is " + monsterName + ". My monster also has " + monsterEyes + " eyes and " + monsterBellyButton + " belly button.";
		
		return monsterInfo;
	}
}
