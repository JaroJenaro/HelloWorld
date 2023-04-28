package de.iav.helloworld;

import java.text.MessageFormat;

public class HelloWorld {

	//Methode = Funktion
	// die Methode aus der unser
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hallo Welt!");
		
		
//		short
//		int age = 25;
//		long
//		
//		double
//		float
//		
//		boolean
//		byte
//		
		/***
		 * 
		 */
		
		char lieblingsBuchstabe = 'a';
		boolean wahrOderFalsch = true;
		String einName = "Marcel";
		String unserErsterSatz = "Hallo nochmals..." + "Gerd " + "und " + einName;
		System.out.println(unserErsterSatz);

		System.out.println("Seite 12");
		int var1 = 2345;
		int var5 = 7767;
		int summe = var1 + var5;
		
		unserErsterSatz = MessageFormat.format("Summe {0}" , summe);
		System.out.println("Summe " + summe);
		
		System.out.println(" ");
		System.out.println("Seite 18");
		System.out.println(" integer");
		unserErsterSatz = MessageFormat.format("Summe {0}" , var1 + var5);

		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Differenz {0}" , var1 - var5);
		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Muti {0}" , var1 * var5);
		System.out.println(unserErsterSatz);
		int var2 = 16;
		int var3 = 4;

		
		unserErsterSatz = MessageFormat.format("Differenz {0}" , var2/var3);
		System.out.println(unserErsterSatz);
		
		// float
		
		System.out.println(" ");
		System.out.println("float ");
		
		float float1 = 10.5f; 
		float float2 = 21.3f; 
		float float3 = 21.0f;
		unserErsterSatz = MessageFormat.format("Summe {0}" , float1 + float2);

		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Differenz {0}" , float1 - float2);
		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Muti {0}" , float1 * float2);
		System.out.println(unserErsterSatz);
		
		
		unserErsterSatz = MessageFormat.format("Differenz {0}" , float3/float1);
		System.out.println(unserErsterSatz);
		
		// double
		
		System.out.println(" ");
		System.out.println("double ");
		
		double double1= 10.5; 
		double double2 = 21.3; 
		double double3 = 21.0;
		
		unserErsterSatz = MessageFormat.format("Summe {0}" , double1 + double2);

		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Differenz {0}" , double1 - double2);
		System.out.println(unserErsterSatz);
		unserErsterSatz = MessageFormat.format("Muti {0}" , double1 * double2);
		System.out.println(unserErsterSatz);
		
		
		unserErsterSatz = "Differenz " + double3/double1;
		System.out.println(unserErsterSatz);
				
		
	}

}
