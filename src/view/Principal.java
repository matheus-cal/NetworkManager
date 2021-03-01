package view;

import java.util.Scanner;
import controller.RedesController;


public class Principal {

	public static void main(String[] args){
		menu();
}
	
	public static void menu() {
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 System.out.println("Digite 1 para ver IPs \nDigite 2 para ver tempo médio de PINGs \nDigite 0 para encerrar o programa.");
		 int select = scan.nextInt();
		 RedesController ntw = new RedesController();
		 String os = ntw.os();
		 
		 switch (select) {
		 case 0:
			 System.out.println("Sistema encerrado. Stay safe!");
			 System.exit(0);
			 break;
		 case 1:
			 @SuppressWarnings("unused") Scanner scan2 = new Scanner(System.in);
			 System.out.println("Aqui está: \n");
			 ntw.adapterView(os);
			 System.out.println("\n");
			 menu();
			 break;
		 case 2:
			 @SuppressWarnings("unused") Scanner scan3 = new Scanner(System.in);
			 System.out.println("Aqui está: \n");
			 ntw.pingCounter(os);
			 System.out.println("\n");
			 menu();
			 break;
		default:
			 System.out.println("Opção iválida! Digite de 0 a 2. \n");
			 System.out.println("\n");
			 menu();
		 }
	}
}
