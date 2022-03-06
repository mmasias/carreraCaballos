class Carrera {

    private int numeroCaballos = 2;
    private int longitudPista = 25;
    private Pista pista;
    private Caballo[] caballos;
    private Turno turno;

    public Carrera() {
        pista = new Pista(longitudPista, numeroCaballos);
        caballos = new Caballo[numeroCaballos];
        for (int i = 0; i < numeroCaballos; i++) {
            caballos[i] = new Caballo(i + 1);
        }
        turno = new Turno(numeroCaballos);
    }

    public void jugar() {
        do {
            pista.mostrar();
            caballos[turno.toca()].moverse(pista);
            if (!pista.hayGanador()) {
                turno.cambiar();
            }
        } while (!pista.hayGanador());
        caballos[turno.toca()].celebraVictoria();
    }

    public static void main(String[] args) {
        new Carrera().jugar();
    }
}
