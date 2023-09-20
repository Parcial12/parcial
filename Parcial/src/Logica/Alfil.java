package Logica;

public class Alfil extends AJEDREZ{

	public Alfil() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int movimientos() {
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i - j == fila - columna) {
                    contador++;
                }
                if (i + j == fila + columna) {
                    contador++;
                }
            }
        }
        contador--;
        System.out.println("La pieza Torre puede ocupar" +contador + " casillas");
		return 0;
	}

}
