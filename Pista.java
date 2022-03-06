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
        for (int i=1;i<=numeroPistas;i++){
            if (this.hayGanador(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean hayGanador(int unJugador) {
        if (this.casillas[unJugador-1][this.largo-1] == unJugador) {
            return true;
        } else {
            return false;
        }
        
    }

    public void avanzarCaballo(int miPosicion, int miNombre) {
        if (miPosicion>=this.largo-1) {miPosicion=this.largo-1;}
        this.casillas[miNombre - 1][miPosicion] = miNombre;
    }

}
