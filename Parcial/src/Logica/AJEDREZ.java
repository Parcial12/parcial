package Logica;

public abstract class AJEDREZ {
	public int[][] tablero = new int[8][8];
	int contador, fila, columna;
	public AJEDREZ() {
		for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 8; j++) {
	            tablero[i][j] = j + 1;
	        }
	    }
	}
	
	
	public abstract int movimientos();

}
