package de.iav.helloworld;
import java.util.Scanner;
import java.time.Year;
public class AufgabeA_Rente {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
  
  
  System.out.print("Mitglied Rentenkasse");
  boolean mitgliedRentenkasse = scanner.nextBoolean();
  if (mitgliedRentenkasse)
  {
	  System.out.print("When did you start working?");
	  int startOfWork = scanner.nextInt();
	  
	  //System.out.print("");
	  Year year = Year.now();
	  int thisYear = year.getValue();
	  
	  if ((thisYear - startOfWork)<50)
	  {
	   System.out.print("Rente ist noch nicht in Aussicht...");
	  
	  }
	  else if ((thisYear - startOfWork)>=50 & (thisYear - startOfWork)<=54)
	  {
	   System.out.print("Du gehst bald in Rente");
	  
	  }
	  else if ((thisYear - startOfWork)>=55)
	  {
	   System.out.print("Du darfst in die Rente! Hier sind 100€, viel Spaß haha");
	  
	  }
	  else
	  {
	   System.out.print("invalid input");
	  }
  }
  else 
  {
	  System.out.print("Du bist gar nicht in der Rentenkasse du Schmarotzer!");
	
  }

 }

}