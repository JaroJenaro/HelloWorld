package de.iav.helloworld;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Stuffe ein A, B, C, D, oder F");
		String inpString = scanner.next();
		
		switch (inpString) {
			case "A":
				System.out.println("perfekte Arbeit");
				break;
			case "B":
				System.out.println("Gute Arbeit");
				break;
			case "C":
				System.out.println("durchschnittliche Arbeit");
				break;
			case "D":
				System.out.println("Du kannst besser Arbeiten");
				break;
			case "F":
				System.out.println("Gib Dir Mühe");
				break;
			default:
				System.out.println("Falsche Eingabe !");
				
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib den Namen des Monats ein, dessen Tage ausgegeben werden sollen");
		String inpString = scanner.next();
		
		switch (inpString) {
			case "Januar":
			case "Marz":
			case "Mai":
			case "Juli":
			case "August":
			case "Oktober":
			case "Dezember":
				System.out.println("Der Monat hat 31 Tage");
				break;	
			case "April":
			case "Juni":
			case "September":
			case "November":
				System.out.println("Der Monat hat 30 Tage");
				break;			
			case "Februar":
				System.out.println("Der Monat hat 28 und alle 4 Jahre 29 Tage");
				break;	
			default:
				System.out.println("Falsche Eingabe");
		}
		*/
		
		/*
			
		System.out.println("summe getSumFrom: " + getSumFrom(2,3));
		System.out.println("summe getSumAsStr: " + getSumAsStr(2,3));
		AdditionForUser();
		*/
		
		/*
		alarmStufe();
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe die Anzahl der Personen 'alarmStufeWithParameter':");
		int numberOfPersons = scanner.nextInt();
		alarmStufeWithParameter(numberOfPersons);
		System.out.println();
		alarmStufeColorTest();
		*/
		//facultyWithFor();
		//facultyWithWhile();
		testeFaculty();
				
	}
	public static int getSumFrom(int val1, int val2) {
		return val1 + val2;
	}
	public static String getSumAsStr(int val1, int val2) {
		String summeString = "Summe: " + (val1 + val2);
		return summeString;
	}
	public static void AdditionForUser() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe den ersten Wert:");
		int value1 = scanner.nextInt();
		if (value1 > 100 )
			System.out.println("Wert 1 ist größer als 100");

		System.out.println("Gebe den zweiten Wert:");
		int value2 = scanner.nextInt();
		if (value2 > 100 )
			System.out.println("Wert 2 ist größer als 100");

		System.out.println("Die Summe ist: " + (value1+value2));
			
	}
	
	public static void alarmStufeWithParameter(int numberOfPersons) {
		if (numberOfPersons > 30)
		{
			System.out.println("Zu viele Personen zurück");
		}
		else if(numberOfPersons < 30)
		{
			System.out.println("Maximale Personenzahl nicht überschritten");
		}
		else {
			System.out.println("Exakta Anzahl Personen");
		}
	}
	
	public static void alarmStufe() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe die Anzahl der Personen 'alarmStufe':");
		int numberOfPersons = scanner.nextInt();
		if (numberOfPersons > 30)
		{
			System.out.println("Zu viele Personen");
		}
		else if(numberOfPersons < 30)
		{
			System.out.println("Maximale Personenzahl nicht überschritten");
		}
		else {
			System.out.println("Exakte Anzahl Personen");
		}
	}
	public static String alarmStufeColor(String alarmStufe) {
		String alarmStufeMeldung;
				
		switch (alarmStufe) {
		case "rot":
			alarmStufeMeldung = "keine Personen erlaubt";
			break;
		case "gelb":
			alarmStufeMeldung = "max 30 Personen erlaubt";
			break;
		case "grün":
			alarmStufeMeldung = "max 60 Personen erlaubt";
			break;
		default:
			alarmStufeMeldung = "ungültige Angabe";
		
		}
		/*
		 * Alarmstufe „rot“: keine Personen erlaubt 
		 * Alarmstufe „gelb“: max 30 Personen erlaubt 
		 * Alarmstufe „grün“: max 60 Personen erlaubt
		 */	
		return alarmStufeMeldung;
	}
	public static void alarmStufeColorTest() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe die Alarmstufe an (rot, gelb oder grün):");
		String alarmStufe = scanner.next();
				
		System.out.println("Die Alarmstufe ergibt das: '" + alarmStufeColor(alarmStufe) + "'");
				
		
	}
	public static void facultyWithFor() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe die Zahl für die Fakultätberechnung 'facultyWithFor':");
		int valueFor = scanner.nextInt();
				
		System.out.println("Fakultät von 'facultyWithFor'" + valueFor + " ist gleich: : " + calcFacultyWithFor(valueFor) );
				
		
	}
	
	public static int calcFacultyWithFor(int val) {
		
		int res = 1;
		for (int i=1; i<=val;i++)
		{
			
				res = res *i;

		}
		
		return res;		
				
	}
	public static void facultyWithWhile() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe die Zahl für die Fakultätberechnung 'facultyWithWhile':");
		int valueWhile = scanner.nextInt();
				
		System.out.println("Fakultät von 'facultyWithWhile'" + valueWhile + " ist gleich: : " + calcFacultyWithWhile(valueWhile) );
				
		
	}
	
	public static void facultyWithForPar(int valueFor) {
		System.out.println("Fakultät von 'facultyWithFor'" + valueFor + " ist gleich: : " + calcFacultyWithFor(valueFor) );
	}
	public static void facultyWithWhilePar(int valueWhile) {
		System.out.println("Fakultät von 'facultyWithWhile'" + valueWhile + " ist gleich: : " + calcFacultyWithWhile(valueWhile) );
	}
	
	public static int calcFacultyWithWhile(int val) {
		
		int i = 1;
		int res = 1;
		while (i<=val){
			res = res *i;
			i++;
		}
		return res;		
	}
	public static void testeFaculty() {
		
		for (int i=0; i<=7;i++)
		{
			facultyWithForPar(i);
			facultyWithWhilePar(i);
		}
		
	}

}
