package de.iav.helloworld;

public class ArrayAufgabe {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int [] intArray = new int [3];
		  String [] stringArray = new String [3];
		  boolean [] boolArray = new boolean [3];
		  
		  
		  intArray[0] = 10;
		  intArray[1] = 11;
		  intArray[2] = 12;
		  
		  System.out.println("Erste Stelle: " + intArray[0] + " Letzte Stelle: " + intArray[intArray.length-1]);
		  //stringArray [stringArray.length-1] = "Musslim";
		  
		  System.out.println("Summe: " + (intArray[0]+intArray[1]));
		  
		  
		  System.out.println("Länge intArray: " + intArray.length);

	}

}
