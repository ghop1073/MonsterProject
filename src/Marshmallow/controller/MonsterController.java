package Marshmallow.controller;

import monster.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
 private MarshmallowMonster gageMonster;
 private MonsterDisplay myDisplay;
 private Scanner monsterScanner;
 
  public MonsterController()
  {
	  String name = "Baller";
	  int eyes = 4;
	  int noses = 1;
	  double legs = 2.0;
	  double hair = 3.0;
	  boolean hasBellyButton = true;
		
	  monsterScanner = new Scanner(System.in);
	  myDisplay = new MonsterDisplay();
	  gageMonster = new MarshmallowMonster(name, eyes, noses, legs, hair, hasBellyButton);
  }
  
 public void start()
 {
	myDisplay.displayInfo(gageMonster.toString());
	askQuestions();
	myDisplay.displayInfo("Updated monster Info: " + gageMonster.toString());
 }
 
 private void askQuestions()
 {
	 System.out.println("I want a new name for a monster, type one please!");
	 String newMonsterName = monsterScanner.next();
	 gageMonster.setMonsterName(newMonsterName);
 }
 
}
