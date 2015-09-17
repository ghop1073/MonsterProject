package Marshmallow.controller;

import monster.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
 private MarshmallowMonster gageMonster; //Declares a Monster called gageMonster
 private MarshmallowMonster userMonster;
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
	createUserMonster();
	myDisplay.displayInfo("Updated monster Info: " + userMonster.toString());
 }
 
 private void askQuestions()

 {
	 System.out.println("I want a new name for a monster, type one please!");
	 String newMonsterName = monsterScanner.next();
	 gageMonster.setMonsterName(newMonsterName);
	 
	 System.out.println("Give me a new number of noses!");
	 int updatedNoses = monsterScanner.nextInt();
	 gageMonster.setMonsterNoses(updatedNoses);
	 
	 System.out.println("Give me a new number of eyes!");
	 int updatedEyes = monsterScanner.nextInt();
	 gageMonster.setMonsterEyes(updatedEyes);
	 
	 System.out.println("Give me a new number of legs.");
	 double updatedLegs = monsterScanner.nextDouble();
	 gageMonster.setMonsterLegs(updatedLegs);
	 
	 System.out.println("Give me a new number of hair.");
	 double updatedHair = monsterScanner.nextDouble();
	 gageMonster.setMonsterHair(updatedHair);
	 
	 System.out.println("Do I still have a belly button, ture or false.");
	 boolean updatedBellyButton = monsterScanner.nextBoolean();
	 gageMonster.setMonsterBellyButton(updatedBellyButton);
	 
 }

 /**
  * Creates a marshmallowMonster instance from user input
  */
 private void createUserMonster()
 {
	 //Step one: Gather user information.
	 System.out.println("What is my monsters name?");
	 String userName = monsterScanner.nextLine();
	 
	 System.out.println("How many legs will it have?");
	 double userLegs = monsterScanner.nextDouble();
	 
	 System.out.println("How many pieces of hair will my character have?");
	 double userHair = monsterScanner.nextDouble();
	 
	 System.out.println("Is it true that I have a belly button.");
	 boolean userBellyButton = monsterScanner.nextBoolean();
	 
	 System.out.println("How many eyes do I have?");
	 int userEyes = monsterScanner.nextInt();
	 
	 System.out.println("How many noses do I have?");
	 int userNoses = monsterScanner.nextInt();
	 
	 //Step two: Build the monster using the constructor.
	 userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userLegs, userHair, userBellyButton);
	 
 }
}
