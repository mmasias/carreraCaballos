public class Caballo {

    private int miNombre;
    private int miPosicion;

    public Caballo(int nombre) {
        this.miNombre = nombre;
        this.miPosicion = 0;
    }

    public int nombre() {
        return this.miNombre;
    }

    public void moverse(Pista pista) {
        int avance;
        avance = (int) (Math.random() * 3 - 1);
        miPosicion = miPosicion + avance;
        pista.avanzarCaballo(miPosicion, miNombre);
    }

    public void celebraVictoria() {
        System.out.println("Ha ganado " + this.miNombre);
    }

}
