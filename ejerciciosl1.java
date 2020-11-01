package co.edu.campusucc;

import java.util.Scanner;

public class ejerciciosl1 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +" );
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
		System.out.println(" - |         FECHA: 31-OCTUBRE-2020    | +" );
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
		System.out.println(" - |              ID:   760728         | +" );
		System.out.println(" + |___________________________________| -" );
		System.out.println(" 88888888888888888888888888888888888888888" );
		System.out.println(" _______________________________________   ");
		System.out.println("|                                       |"); 
		System.out.println("|      ejercicios1 de laboratorio       |");
		System.out.println("|_______________________________________|");
		System.out.println();
		
		int l1,l2;
		boolean tr1= false,tr2=false,k;
		
		try (Scanner leer = new Scanner(System.in) ) {
				
			System.out.println("¿la tierra es redonda? [0]...verdad? ");
				l1 = leer.nextInt();
				System.out.print("¿simon bolibar liberto a panama? [0]...falso [1]...verdad? ");
				l2 = leer.nextInt();
	}
	if (l1==1) tr1=true;
	if (l2==0) tr2=true;
				
	k= tr1 & tr2;		
	
	System.out.println(" el valor de la variable k es: "+k );
}
}
