package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}

	
	public String os() {
		String os = System.getProperty("os.name");
		
		return os;
	}
	
	public void adapterView(String os) {
		
		if (os.contains("Windows")) {
			String cmd = "ipconfig";
			try {
				Process p = Runtime.getRuntime().exec(cmd);
				InputStream flow = p.getInputStream();
				InputStreamReader reader = new InputStreamReader(flow);
				BufferedReader buffer = new BufferedReader(reader);
				String line = buffer.readLine();
				
				while (line != null) {
					if (line.contains("Adaptador") && !line.contains("Ethernet 2") ) {
						line = line.substring(18);
						System.out.println(line.trim());
					}
					
					if (line.contains("IPv4")) {
						line = line.replaceAll(". . . . . . . .", "");
						System.out.println(line.trim());
						System.out.println(" ");
					}
//					System.out.println(line);
					line = buffer.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		if (os.contains("Linux")) {
			String cmd = "ifconfig";
			try {
				Process p = Runtime.getRuntime().exec(cmd);
				InputStream flow = p.getInputStream();
				InputStreamReader reader = new InputStreamReader(flow);
				BufferedReader buffer = new BufferedReader(reader);
				String line = buffer.readLine();
				
				while (line != null) {
					if (line.contains("flags") && !line.contains("enp2s0") && line.contains("BROADCAST")) {
						String [] list = line.split(" ");
						line = list[0];
						System.out.println(line.trim());
					}
					
					if (line.contains("broadcast")) {
						line = line.trim();
						String [] list = line.split(" ");
						line = list[7];
						System.out.println(line.trim());
//						System.out.println(" ");
					}
//					System.out.println(line);
					line = buffer.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

//	public void pingCounter(String os, String server) {
//		
//	}











}
