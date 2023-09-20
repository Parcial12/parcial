package Logica;

public class Torre extends AJEDREZ{

	public Torre() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int movimientos() {
		for (int i = 0; i < 8; i++) {
            if (i != fila) {
                contador++;
            }
        }
        for (int j = 0; j < 8; j++) {
            if (j != columna) {
                contador++;
            }
        }
        System.out.println("La pieza Torre puede ocupar" +contador + " casillas");
        return 1;
	}
	
}
