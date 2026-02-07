package Ex12;

public class Smartphone extends Telefon {

    public void detalii() {
        System.out.println("Telefonul are marca " + marca);
        System.out.println("Anul producerii este " + getAnulProducerii());
    }

    public static void main(String[] args) {
        Smartphone meu = new Smartphone();
        meu.detalii();
    }
}
