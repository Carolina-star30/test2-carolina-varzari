package Ex13;

public class CardBancar {

    String posesor;
    private double sold;
    private int pin;

    public CardBancar(String posesor, double soldInitial, int pin) {
        this.posesor = posesor;
        this.sold    = soldInitial;
        this.pin     = pin;
    }

    public double getSold() {
        return sold;
    }

    public void plateste(double suma) {
        if (suma <= sold) {
            sold -= suma;
            System.out.println(posesor + " a platit " + suma + " lei. Sold ramas : " + sold);
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
