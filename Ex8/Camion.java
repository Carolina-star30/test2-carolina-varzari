package Ex8;

public class Camion {

    public void transportaLaMagazin(Pufulet p1, Pufulet p2, String magazin) {

        System.out.println("Camionul livreaza la magazinul " + magazin);
        System.out.println("In camion sunt pufuletii " + p1.getNume() + " si " + p2.getNume());
        System.out.println("Livrare efectuata cu succes ");
        System.out.println(" ");
    }
}
