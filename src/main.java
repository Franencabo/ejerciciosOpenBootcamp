public class main {

    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.AnyadirPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 4;

    public void AnyadirPuerta() {
        this.puertas++;
    }
}