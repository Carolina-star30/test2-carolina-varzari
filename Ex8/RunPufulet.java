package Ex8;

public class RunPufulet {
    public static void main(String[] args) {

        Pufulet cristinel  = new Pufulet("Cristinel");
        Pufulet cristinuta = new Pufulet("Cristinuta");

        Camion camion = new Camion();

        camion.transportaLaMagazin(cristinel, cristinuta, "Metro");
        camion.transportaLaMagazin(cristinel, cristinuta, "Nr1");
        camion.transportaLaMagazin(cristinel, cristinuta, "Linella");
    }
}
