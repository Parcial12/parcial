package Logica;

public class Dama extends AJEDREZ{

	public Dama() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int movimientos() {
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == fila || j == columna) {
                    contador++;
                }
                if (i - j == fila - columna) {
                    contador++;
                }
                if (i + j == fila + columna) {
                    contador++;
                }
            }
        }
        contador -= 3;
        System.out.println("La pieza Torre puede ocupar" +contador + " casillas");
		return 0;
	}

}
