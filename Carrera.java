class Carrera {

    private int numeroPistas = 5;
    private Pista pista;
    private Caballo[] caballos;
    private Turno turno;

    public Carrera() {
        pista = new Pista(20,numeroPistas);
        caballos = new Caballo[numeroPistas];
        for (int i=0;i<numeroPistas;i++) {
            caballos[i] = new Caballo(i+1);
        }        
        turno = new Turno(numeroPistas);
    }

    public void jugar() {
        do {
            pista.mostrar();
            caballos[turno.toca()].moverse(pista);
            if (!pista.hayGanador()) {turno.cambiar();}
        } while (!pista.hayGanador());
        caballos[turno.toca()].celebraVictoria();
    }

    public static void main(String[] args) {
        new Carrera().jugar();
    }
}
