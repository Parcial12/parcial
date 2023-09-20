package Logica;

public class Rey extends AJEDREZ {

	public Rey() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int movimientos() {
		int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int k = 0; k < 8; k++) {
            int nf = fila + dr[k];
            int nc = columna + dc[k];
            if (nf >= 0 && nf < 8 && nc >= 0 && nc < 8) {
                contador++;
            }
        }
        System.out.println("La pieza Torre puede ocupar" +contador + " casillas");
		return 0;
	}

}
