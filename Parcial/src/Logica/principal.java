package Logica;

import java.util.Scanner;

public class principal {
	String tipop;
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Ingrse:"
				+ "1) peon "
				+ "2) torre"
				+ "3) alfil "
				+ "4) caballo"
				+ "5) rey "
				+ "6) dama");
		int tipop = entrada.nextInt();
		
		if (tipop == 1) {
			Peon peon= new Peon();
			peon.movimientos();
			
		}else if (tipop== 2){
			Torre torre= new Torre();
			torre.movimientos();
			
		}else if (tipop== 3){
			Alfil alfil=new Alfil();
			alfil.movimientos();
			
		}else if (tipop== 4){
			Caballo caballo = new Caballo();
			caballo.movimientos();
			
		}else if (tipop== 5){
			Rey rey = new Rey();
			rey.movimientos();
		}else if (tipop== 6){
			Dama dama= new Dama();
			dama.movimientos();
		}
	}
}


