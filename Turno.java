public class Turno {

    private int elTurno;
    private int numeroElementos;

    public Turno(int i) {
        this.numeroElementos=i;
        elTurno = (int) (Math.random()*numeroElementos);
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
        for (int i = 0; i < 5; i++) {
            turno = new Turno(2);
            System.out.print(turno.toca());
            System.out.print(turno.noToca());
            turno.cambiar();
            System.out.print(turno.toca());
            System.out.println(turno.noToca());
        }
    }

}
