public class Turno {

    private int elTurno;
    private int numeroElementos;

    public Turno(int i) {
        this.numeroElementos=i;
        elTurno = 0;
    }

    public void cambiar() {
        elTurno = this.elTurno+1;
        if (elTurno>=numeroElementos) {
            elTurno = 0;
        }
    }

    public int toca() {
        return elTurno;
    }

    public int noToca() {
        return (elTurno + 1) % 2;
    }

    public static void main(String[] args) {
        Turno turno;
        turno = new Turno(5);
        for (int i = 0; i < 10; i++) {
            System.out.print(turno.toca());
            turno.cambiar();

        }
    }

}
