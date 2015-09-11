package Marshmallow.controller;

import monster.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
 private MarshmallowMonster gageMonster;
 private MonsterDisplay myDisplay;
 
  public MonsterController()
  {
	  String name = "Baller";
	  int eyes = 4;
	  int noses = 1;
	  double legs = 2.0;
	  double hair = 3.0;
	  boolean hasBellyButton = true;
		
	  myDisplay = new MonsterDisplay();
	  gageMonster = new MarshmallowMonster(name, eyes, noses, legs, hair, hasBellyButton);
  }
  
 public void start()
 {
	myDisplay.displayInfo(gageMonster.toString());
 }
}
