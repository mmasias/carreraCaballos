public class Turno {

    private int elTurno;

    public Turno(){
        elTurno=(int)(Math.random()+0.5);
    }

    public void cambiar() {
        elTurno = this.noToca();
    }

    public int toca() {
        return elTurno;
    }

    public int noToca() {
        return (elTurno+1)%2;
    }

    public static void main(String[] args){
        Turno turno;
        for (int i=0;i<5;i++) {
            turno = new Turno();
            System.out.print(turno.toca());
            System.out.print(turno.noToca());
            turno.cambiar();
            System.out.print(turno.toca());
            System.out.println(turno.noToca());
        }
    }

}
