package view;

import controller.RedesController;

public class Principal {

	public static void main(String[] args) {
		RedesController ntw = new RedesController();
		
		String os = ntw.os();
		
//		String server = "www.google.com.br";
		
		ntw.adapterView(os);
//		ntw.pingCounter(os, server);
//		System.out.println(os);
	}

}
