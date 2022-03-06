public class Pista {

    private int[][] casillas;
    private int largo;
    private int numeroPistas;

    public Pista(int longitud, int numeroPistas) {
        this.largo = longitud;
        this.numeroPistas = numeroPistas;
        casillas = new int[numeroPistas][longitud];
    }

    public void mostrar() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print("[" + casillas[i][j] + "]");
            }
            System.out.println();
        }
        for (int j = 0; j < casillas[0].length; j++) {
            System.out.print("---");
        }
        System.out.println();
    }

    public boolean hayGanador() {
        return this.hayGanador(1) || this.hayGanador(2);
    }

    private boolean hayGanador(int unJugador) {
        if (casillas[unJugador - 1][largo - 1] == unJugador) {
            return true;
        }
        return false;
    }

    public void avanzarCaballo(int avance, int miNombre) {
        this.casillas[miNombre - 1][avance] = miNombre;
    }

}
