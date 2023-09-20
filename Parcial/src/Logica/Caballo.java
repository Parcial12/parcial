package Logica;

public class Caballo extends AJEDREZ{

	public Caballo() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int movimientos() {
		int[] df = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};
        for (int k = 0; k < 8; k++) {
            int nf = fila + df[k];
            int nc = columna + dc[k];
            if (nf >= 0 && nf < 8 && nc >= 0 && nc < 8) {
                contador++;
            }
        }
        System.out.println("La pieza Torre puede ocupar" +contador + " casillas");
		return 0;
	}

}
